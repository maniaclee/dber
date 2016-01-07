// Generated from /Users/peng/workspace/github/dber/src/main/resources/Test.g4 by ANTLR 4.5.1
package psyco.dber.parser.test;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(TestParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link TestParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(TestParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link TestParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(TestParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link TestParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(TestParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link TestParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(TestParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(TestParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(TestParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(TestParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ne}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNe(TestParser.NeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Get}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(TestParser.GetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(TestParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link TestParser#predict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(TestParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#predicts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicts(TestParser.PredictsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(TestParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#tell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTell(TestParser.TellContext ctx);
}