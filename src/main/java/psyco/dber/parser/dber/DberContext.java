package psyco.dber.parser.dber;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.ParserRuleContext;
import psyco.dber.mapper.ParameterMapper;
import psyco.dber.mapper.Sentence;
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
    private final StringBuilder builder;

    public DberContext(DberParser.SentenceContext sentenceContext, String input) {
        this.ctxes = reverseMerge(sentenceContext.exprPredict(), sentenceContext.exprSimple());
        this.input = input;
        this.builder = new StringBuilder(input);
    }

    public List<DberParser.ExprPredictContext> getExprPredictContexts() {
        return getContextByType(DberParser.ExprPredictContext.class);
    }

    public List<DberParser.ExprSimpleContext> getExprSimpleContexts() {
        return getContextByType(DberParser.ExprSimpleContext.class);
    }

    public String parse(Sentence sentence, Object[] args) throws Exception {
        List argResult = Lists.newLinkedList();
        for (ParserRuleContext c : ctxes) {
            if (c instanceof DberParser.ExprSimpleContext) {
                processSimple(sentence, args, (DberParser.ExprSimpleContext) c, argResult);
            } else if (c instanceof DberParser.ExprPredictContext) {
                processPredict(sentence, args, (DberParser.ExprPredictContext) c, argResult);
            }
        }
        return builder.toString();
    }

    private void processSimple(Sentence sentence, Object[] args, DberParser.ExprSimpleContext c, List argResult) throws NoSuchFieldException {
        if (c.varExpr() != null) {
            DberParser.VarExprContext var = c.varExpr();
            argResult.add(parseVarValue(sentence, args, var));
            replace(c, SqlPlaceHolder);
        }
    }

    private Object parseVarValue(Sentence sentence, Object[] args, DberParser.VarExprContext var) throws NoSuchFieldException {
        List<String> names = var.vars.stream().map(v -> v.getText()).collect(Collectors.toList());
        return extractEntityValue(getArgByName(names.get(0), sentence, args), names, var.getText());
    }

    private Object getArgByName(String name, Sentence sentence, Object[] args) {
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

    private void replace(ParserRuleContext c, String s) {
        builder.replace(c.getStart().getStartIndex(), c.getStop().getStopIndex(), s);
    }

    private void processPredict(Sentence sentence, Object[] args, DberParser.ExprPredictContext c, List argResult) {
        DberParser.PredictContext predict = c.predict();
        //TODO
        if (true) {
            c.predictBodyTrue();
        } else {
            c.predictBodyFalse();
        }
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

}
