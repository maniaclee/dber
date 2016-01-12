package psyco.dber.parser.dber;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import psyco.dber.parser.dber.lex.DberLexer;
import psyco.dber.parser.dber.lex.DberListener;
import psyco.dber.parser.dber.lex.DberParser;

/**
 * Created by lipeng on 16/1/12.
 */
public class DberLexParser {

    public static void sdf(String input) throws Exception {
        DberLexer lexer = new DberLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DberParser parser = new DberParser(tokens);
        DberParser.SentenceContext tree = parser.sentence(); // parse a compilationUnit

        DberParserListener extractor = new DberParserListener();
        ParseTreeWalker.DEFAULT.walk(extractor, tree);
    }

    public static class DberParserListener implements DberListener {

        @Override
        public void enterNum(DberParser.NumContext ctx) {

        }

        @Override
        public void exitNum(DberParser.NumContext ctx) {

        }

        @Override
        public void enterValue(DberParser.ValueContext ctx) {

        }

        @Override
        public void exitValue(DberParser.ValueContext ctx) {

        }

        @Override
        public void enterVarExpr(DberParser.VarExprContext ctx) {

        }

        @Override
        public void exitVarExpr(DberParser.VarExprContext ctx) {

        }

        @Override
        public void enterCalVar(DberParser.CalVarContext ctx) {

        }

        @Override
        public void exitCalVar(DberParser.CalVarContext ctx) {

        }

        @Override
        public void enterCal(DberParser.CalContext ctx) {

        }

        @Override
        public void exitCal(DberParser.CalContext ctx) {

        }

        @Override
        public void enterPredict(DberParser.PredictContext ctx) {

        }

        @Override
        public void exitPredict(DberParser.PredictContext ctx) {

        }

        @Override
        public void enterConstIf(DberParser.ConstIfContext ctx) {

        }

        @Override
        public void exitConstIf(DberParser.ConstIfContext ctx) {

        }

        @Override
        public void enterAny(DberParser.AnyContext ctx) {

        }

        @Override
        public void exitAny(DberParser.AnyContext ctx) {

        }

        @Override
        public void enterExprSimple(DberParser.ExprSimpleContext ctx) {

        }

        @Override
        public void exitExprSimple(DberParser.ExprSimpleContext ctx) {

        }

        @Override
        public void enterPredictBodyTrue(DberParser.PredictBodyTrueContext ctx) {

        }

        @Override
        public void exitPredictBodyTrue(DberParser.PredictBodyTrueContext ctx) {

        }

        @Override
        public void enterPredictBodyFalse(DberParser.PredictBodyFalseContext ctx) {

        }

        @Override
        public void exitPredictBodyFalse(DberParser.PredictBodyFalseContext ctx) {

        }

        @Override
        public void enterExprPredict(DberParser.ExprPredictContext ctx) {

        }

        @Override
        public void exitExprPredict(DberParser.ExprPredictContext ctx) {

        }

        @Override
        public void enterOp(DberParser.OpContext ctx) {

        }

        @Override
        public void exitOp(DberParser.OpContext ctx) {

        }

        @Override
        public void enterAndOr(DberParser.AndOrContext ctx) {

        }

        @Override
        public void exitAndOr(DberParser.AndOrContext ctx) {

        }

        @Override
        public void enterSentence(DberParser.SentenceContext ctx) {

        }

        @Override
        public void exitSentence(DberParser.SentenceContext ctx) {

        }

        @Override
        public void visitTerminal(TerminalNode terminalNode) {

        }

        @Override
        public void visitErrorNode(ErrorNode errorNode) {

        }

        @Override
        public void enterEveryRule(ParserRuleContext parserRuleContext) {

        }

        @Override
        public void exitEveryRule(ParserRuleContext parserRuleContext) {

        }
    }
}
