// Generated from /Users/peng/workspace/github/dber/src/main/resources/Dber.g4 by ANTLR 4.5.1
package psyco.dber.parser.dber;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link DberVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class DberBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements DberVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAll(DberParser.AllContext ctx) { return visitChildren(ctx); }
}