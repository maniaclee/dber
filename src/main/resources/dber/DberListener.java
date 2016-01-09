// Generated from Dber.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DberParser}.
 */
public interface DberListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link DberParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(DberParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(DberParser.AnyContext ctx);
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