// Generated from Dber.g4 by ANTLR 4.5
package psyco.dber.parser.dber.lex;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DberParser}.
 */
public interface DberListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DberParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(DberParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(DberParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DberParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DberParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#calVar}.
	 * @param ctx the parse tree
	 */
	void enterCalVar(DberParser.CalVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#calVar}.
	 * @param ctx the parse tree
	 */
	void exitCalVar(DberParser.CalVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(DberParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(DberParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#cal}.
	 * @param ctx the parse tree
	 */
	void enterCal(DberParser.CalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#cal}.
	 * @param ctx the parse tree
	 */
	void exitCal(DberParser.CalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#predict}.
	 * @param ctx the parse tree
	 */
	void enterPredict(DberParser.PredictContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#predict}.
	 * @param ctx the parse tree
	 */
	void exitPredict(DberParser.PredictContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#constIf}.
	 * @param ctx the parse tree
	 */
	void enterConstIf(DberParser.ConstIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#constIf}.
	 * @param ctx the parse tree
	 */
	void exitConstIf(DberParser.ConstIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#exprSimple}.
	 * @param ctx the parse tree
	 */
	void enterExprSimple(DberParser.ExprSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#exprSimple}.
	 * @param ctx the parse tree
	 */
	void exitExprSimple(DberParser.ExprSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#predictBodyTrue}.
	 * @param ctx the parse tree
	 */
	void enterPredictBodyTrue(DberParser.PredictBodyTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#predictBodyTrue}.
	 * @param ctx the parse tree
	 */
	void exitPredictBodyTrue(DberParser.PredictBodyTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#predictBodyFalse}.
	 * @param ctx the parse tree
	 */
	void enterPredictBodyFalse(DberParser.PredictBodyFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#predictBodyFalse}.
	 * @param ctx the parse tree
	 */
	void exitPredictBodyFalse(DberParser.PredictBodyFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#exprPredict}.
	 * @param ctx the parse tree
	 */
	void enterExprPredict(DberParser.ExprPredictContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#exprPredict}.
	 * @param ctx the parse tree
	 */
	void exitExprPredict(DberParser.ExprPredictContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(DberParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(DberParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#andOr}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(DberParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#andOr}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(DberParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DberParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(DberParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(DberParser.SentenceContext ctx);
}