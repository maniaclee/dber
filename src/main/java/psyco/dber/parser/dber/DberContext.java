package psyco.dber.parser.dber;

import com.google.common.collect.Lists;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import psyco.dber.mapper.ParameterMapper;
import psyco.dber.mapper.Sentence;
import psyco.dber.parser.dber.lex.DberParser;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by peng on 16/1/12.
 */
public class DberContext {

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

    public String parse(Sentence sentence, Object[] args) {
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

    private void processSimple(Sentence sentence, Object[] args, DberParser.ExprSimpleContext c, List argResult) {
        if (c.varExpr() != null) {
            DberParser.VarExprContext var = c.varExpr();
            List<Token> names = var.vars;
            String name = names.get(0).getText();
            ParameterMapper paramMapping = sentence.getParameterMappers().get(name);
            replace(c, null);
        }
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
