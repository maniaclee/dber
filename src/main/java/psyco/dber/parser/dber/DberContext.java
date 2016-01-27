package psyco.dber.parser.dber;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import psyco.dber.exception.DberParsingRuntimException;
import psyco.dber.mapper.ParameterMapper;
import psyco.dber.mapper.Sentence;
import psyco.dber.parser.dber.lex.DberLexer;
import psyco.dber.parser.dber.lex.DberParser;
import psyco.dber.utils.ReflectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by peng on 16/1/12.
 */
public class DberContext {

    private static final String SqlPlaceHolder = "?";
    /**
     * reverse order
     */
    private final String input;
    private final Sentence sentence;
    private final DberParser.SentenceContext sentenceContext;


    public DberContext(DberParser.SentenceContext sentenceContext, String input, Sentence sentence) {
        this.sentenceContext = sentenceContext;
        this.input = input;
        this.sentence = sentence;
    }

    public static DberContext getInstance(String input, Sentence sentence) throws Exception {
        DberLexer lexer = new DberLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DberParser parser = new DberParser(tokens);
        DberParser.SentenceContext tree = parser.sentence(); // parse a compilationUnit
        //        DberParserListener extractor = new DberParserListener();
        //        ParseTreeWalker.DEFAULT.walk(extractor, tree);
        System.out.println("[dber] parsing : " + input);
        return new DberContext(tree, input, sentence);
    }

    public ParseHandler parse(Object[] args) {
        ParseHandler handler = new ParseHandler(input, args);
        sentenceContext.children.forEach(c -> {
            if (c instanceof DberParser.VarExprContext) {
                processVar((DberParser.VarExprContext) c, handler);
            } else if (c instanceof DberParser.ExprPredictContext) {
                processPredict(args, (DberParser.ExprPredictContext) c, handler);
            } else
                processAny(c, handler);
        });
        if (handler.getArgList().isEmpty())
            handler.setArgList(Lists.newArrayList(args));
        System.out.println("sql->    " + handler.getSql());
        return handler;
    }

    private void processAny(ParseTree any, ParseHandler handler) {
        handler.addText(any.getText());
    }

    private void processSimple(DberParser.ExprSimpleContext c, ParseHandler handler) {
        if (c.varExpr() != null) {
            processVar(c.varExpr(), handler);
        } else
            processAny(c, handler);
    }


    private void processVar(DberParser.VarExprContext var, ParseHandler handler) {
        handler.args.add(parseVarValue(handler.getArgsOriginal(), var));
        handler.addText(SqlPlaceHolder);
    }


    private Object parseVarValue(Object[] args, DberParser.VarExprContext var) {
        List<String> names = var.vars.stream().map(v -> v.getText()).collect(Collectors.toList());
        return extractEntityValue(getArgByName(names.get(0), args), names);
    }

    private Object getArgByName(String name, Object[] args) {
        ParameterMapper m = sentence.getParameterMappers().get(name);
        Preconditions.checkArgument(m != null && m.index < args.length, "invalid bean value:" + name);
        return args[m.index];
    }


    public static Object extractEntityValue(Object c, String textPlainWithDot) {
        return extractEntityValue(c, Lists.newArrayList(textPlainWithDot.split("\\.")));
    }

    public static Object extractEntityValue(Object c, List<String> props) {
        Preconditions.checkArgument(props != null && !props.isEmpty(), "expression can't be empty:" + props.stream().collect(Collectors.joining(".")));
        if (props.size() > 1)
            for (int i = 1; i < props.size(); i++) {
                try {
                    c = ReflectionUtils.getDeclaredField(c.getClass(), props.get(i));
                } catch (NoSuchFieldException e) {
                    throw new DberParsingRuntimException(e);
                }
            }
        return c;
    }

    private Object extractEntityValue(List<String> props, Object[] args) {
        Object c = getArgByName(props.get(0), args);
        for (int i = 1; i < props.size(); i++) {
            try {
                c = ReflectionUtils.getDeclaredField(c.getClass(), props.get(i));
            } catch (NoSuchFieldException e) {
                throw new DberParsingRuntimException(e);
            }
        }
        return c;
    }

    private void replace(ParserRuleContext c, String s, ParseHandler parseHandle) {
        parseHandle.stringBuilder.replace(c.getStart().getStartIndex(), c.getStop().getStopIndex() + 1, s);
    }

    private void processPredict(Object[] args, DberParser.ExprPredictContext c, ParseHandler handler) {
        if (calPredict(c.predict(), args)) {
            c.predictBodyTrue().forEach(body -> processSimple(body.exprSimple(), handler));
        } else {
            c.predictBodyFalse().forEach(body -> processSimple(body.exprSimple(), handler));
        }
    }

    private boolean calPredict(DberParser.PredictContext c, Object[] args) {
        if (c.cal() != null)
            return cal(c.cal(), args);
        Preconditions.checkArgument(c.predict().size() == 2);
        DberParser.AndOrContext andor = c.andOr();
        boolean left = calPredict(c.predict(0), args);
        if (!left && andor.AND() != null)
            return false;
        return calPredict(c.predict(1), args);
    }

    private boolean cal(DberParser.CalContext cal, Object[] args) {
        System.out.println(cal.getText());
        if (cal.op() != null) {
            Preconditions.checkArgument(cal.cal().size() > 1);
            DberParser.CalVarContext left = cal.cal(0).calVar();
            DberParser.CalVarContext right = cal.cal(1).calVar();
            return calOp(cal, cal.op(), left, right, args);
        } else {
            DberParser.ValueContext v = cal.calVar().value();
            Object value = parseValue(v);
            if (value == null)
                return false;
            if (value instanceof Boolean)
                return (boolean) value;
            throw DberParsingRuntimException.build("invalid value for boolean calculation : " + value);
        }
    }

    private boolean calOp(DberParser.CalContext cal, DberParser.OpContext op, DberParser.CalVarContext a, DberParser.CalVarContext b, Object[] args) {
        Object l = parseCalVar(a, args);
        Object r = parseCalVar(b, args);
        if (op.EQ() != null)
            return Objects.equals(l, r);
        if (op.NOT_EQ() != null)
            return !Objects.equals(l, r);
        int compare = compare(l, r);
        if (op.GET() != null)
            return compare >= 0;
        if (op.GT() != null)
            return compare > 0;
        if (op.LET() != null)
            return compare <= 0;
        if (op.LT() != null)
            return compare < 0;
        throw DberParsingRuntimException.build("invalid cal:" + cal.getText());
    }

    private int compare(Object a, Object b) {
        return Objects.compare(a, b, null);
    }

    private Object parseCalVar(DberParser.CalVarContext c, Object[] args) {
        if (c.value() != null)
            return parseValue(c.value());
        if (c.varExpr() != null)
            return extractEntityValue(c.varExpr().ID().stream().map(v -> v.getText()).collect(Collectors.toList()), args);
        throw DberParsingRuntimException.build("invalid var or value:" + c.getText());
    }

    private Object parseValue(DberParser.ValueContext v) {
        return v.result;
    }

    public static class ParseHandler {
        private Object[] argsOriginal;
        private StringBuilder stringBuilder;
        private List args = Lists.newLinkedList();
        private List<String> texts = Lists.newLinkedList();

        private void addText(String text) {
            this.texts.add(text);
        }

        public String getSql() {
            //            return stringBuilder.toString();
            return texts.stream().collect(Collectors.joining(" "));
        }

        public Object[] getArgs() {
            return args.toArray();
        }

        public List getArgList() {
            return args;
        }

        public void setArgList(List argList) {
            this.args = argList;
        }

        public Object[] getArgsOriginal() {
            return argsOriginal;
        }

        public void setArgsOriginal(Object[] argsOriginal) {
            this.argsOriginal = argsOriginal;
        }

        public ParseHandler(String s) {
            this.stringBuilder = new StringBuilder(s);
        }

        public ParseHandler(String s, Object[] args) {
            this.stringBuilder = new StringBuilder(s);
            this.argsOriginal = args;
        }

    }


}
