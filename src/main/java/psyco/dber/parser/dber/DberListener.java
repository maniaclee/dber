// Generated from /Users/peng/workspace/github/dber/src/main/resources/Dber.g4 by ANTLR 4.5.1
package psyco.dber.parser.dber;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DberParser}.
 */
public interface DberListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DberParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(DberParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link DberParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(DberParser.AllContext ctx);
}