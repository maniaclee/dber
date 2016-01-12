package psyco.dber.parser.dber;

import org.antlr.v4.runtime.ParserRuleContext;
import psyco.dber.mapper.Sentence;
import psyco.dber.parser.dber.lex.DberParser;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by peng on 16/1/12.
 */
public class DberContext {

    private final List<ParserRuleContext> ctxes;
    private final String input;
    private final StringBuilder builder;

    public DberContext(List<ParserRuleContext> ctxes, String input) {
        this.ctxes = ctxes;
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
        return null;
    }

    public <T> List<T> getContextByType(Class<T> clz) {
        return ctxes.stream().filter(p -> p.getClass().isAssignableFrom(clz)).map(p -> (T) p).collect(Collectors.toList());
    }

}
