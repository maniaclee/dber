package psyco.dber.parser.dber;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import psyco.dber.mapper.ParameterMapper;
import psyco.dber.mapper.Sentence;
import psyco.dber.parser.dber.lex.DberLexer;
import psyco.dber.parser.dber.lex.DberParser;
import psyco.dber.utils.ReflectionUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by peng on 16/1/12.
 */
public class DberContext {

    private static final String SqlPlaceHolder = "?";
    /**
     * reverse order
     */
    private final List<ParserRuleContext> ctxes;
    private final String input;
    private final Sentence sentence;


    public DberContext(DberParser.SentenceContext sentenceContext, String input) {
        this(sentenceContext, input, null);
    }

    public DberContext(DberParser.SentenceContext sentenceContext, String input, Sentence sentence) {
        this.ctxes = reverseMerge(sentenceContext.exprPredict(), sentenceContext.exprSimple());
        this.input = input;
        this.sentence = sentence;
    }

    public static DberContext getInstance(String input) throws Exception {
        DberLexer lexer = new DberLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DberParser parser = new DberParser(tokens);
        DberParser.SentenceContext tree = parser.sentence(); // parse a compilationUnit
        //        DberParserListener extractor = new DberParserListener();
        //        ParseTreeWalker.DEFAULT.walk(extractor, tree);
        return new DberContext(tree, input);
    }

    public ParseHandler parse(Object[] args) {
        ParseHandler handler = new ParseHandler(input);
        try {
            for (ParserRuleContext c : ctxes) {
                if (c instanceof DberParser.ExprSimpleContext) {
                    processSimple(args, (DberParser.ExprSimpleContext) c, handler);
                } else if (c instanceof DberParser.ExprPredictContext) {
                    processPredict(args, (DberParser.ExprPredictContext) c, handler);
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return handler;
    }

    private void processSimple(Object[] args, DberParser.ExprSimpleContext c, ParseHandler handler) throws NoSuchFieldException {
        if (c.varExpr() != null) {
            DberParser.VarExprContext var = c.varExpr();
            handler.args.add(parseVarValue(args, var));
            replace(c, SqlPlaceHolder, handler);
        }
    }

    private Object parseVarValue(Object[] args, DberParser.VarExprContext var) throws NoSuchFieldException {
        List<String> names = var.vars.stream().map(v -> v.getText()).collect(Collectors.toList());
        return extractEntityValue(getArgByName(names.get(0), args), names, var.getText());
    }

    private Object getArgByName(String name, Object[] args) {
        ParameterMapper m = sentence.getParameterMappers().get(name);
        Preconditions.checkArgument(m != null && m.index < args.length);
        return args[m.index];
    }


    private Object extractEntityValue(Object c, List<String> props, String text) throws NoSuchFieldException {
        Preconditions.checkArgument(props != null && !props.isEmpty(), "expression can't be empty:" + text);
        if (props.size() > 1)
            for (int i = 1; i < props.size(); i++)
                c = ReflectionUtils.getDeclaredField(c.getClass(), props.get(i));
        return c;
    }

    private void replace(ParserRuleContext c, String s, ParseHandler parseHandle) {
        parseHandle.stringBuilder.replace(c.getStart().getStartIndex(), c.getStop().getStopIndex(), s);
    }

    private void processPredict(Object[] args, DberParser.ExprPredictContext c, ParseHandler handler) {
        if (calPredict(c.predict(), args)) {
            c.predictBodyTrue();
        } else {
            c.predictBodyFalse();
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
        if (cal.op() == null) {
            Preconditions.checkArgument(cal.calVar().size() == 1);
            DberParser.CalVarContext c = cal.calVar().get(0);

        }
        return true;
    }

    public static List<ParserRuleContext> reverseMerge(List l, List... lists) {
        List<ParserRuleContext> re = Lists.newArrayList();
        re.addAll(l);
        if (lists != null) {
            for (int i = 0; i < lists.length; i++)
                re.addAll(lists[i]);
        }
        re.sort(Collections.reverseOrder(Comparator.comparingInt(p -> p.getStart().getCharPositionInLine())));
        return re;
    }

    public <T> List<T> getContextByType(Class<T> clz) {
        return ctxes.stream().filter(p -> p.getClass().isAssignableFrom(clz)).map(p -> (T) p).collect(Collectors.toList());
    }

    public static class ParseHandler {
        private StringBuilder stringBuilder;
        private List args = Lists.newLinkedList();

        public String getSql() {
            return stringBuilder.toString();
        }

        public Object[] getArgs() {
            return args.toArray();
        }

        public ParseHandler(String s) {
            this.stringBuilder = new StringBuilder(s);
        }
    }


}
