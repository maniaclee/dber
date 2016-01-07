// Generated from /Users/peng/workspace/github/dber/src/main/resources/Test.g4 by ANTLR 4.5.1
package psyco.dber.parser.test;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(TestParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(TestParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreak(TestParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreak(TestParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link TestParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMult(TestParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link TestParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMult(TestParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link TestParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAdd(TestParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link TestParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAdd(TestParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TestParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(TestParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TestParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(TestParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void enterEq(TestParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void exitEq(TestParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void enterLt(TestParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void exitLt(TestParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Let}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void enterLet(TestParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void exitLet(TestParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ne}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void enterNe(TestParser.NeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ne}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void exitNe(TestParser.NeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Get}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void enterGet(TestParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Get}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void exitGet(TestParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void enterVar(TestParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void exitVar(TestParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void enterGt(TestParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 */
	void exitGt(TestParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#predicts}.
	 * @param ctx the parse tree
	 */
	void enterPredicts(TestParser.PredictsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#predicts}.
	 * @param ctx the parse tree
	 */
	void exitPredicts(TestParser.PredictsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(TestParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(TestParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#tell}.
	 * @param ctx the parse tree
	 */
	void enterTell(TestParser.TellContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#tell}.
	 * @param ctx the parse tree
	 */
	void exitTell(TestParser.TellContext ctx);
}