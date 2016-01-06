package psyco.dber.parser;

import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import psyco.dber.parser.gen.MySQLLexer;
import psyco.dber.parser.gen.MySQLParser;

import java.io.IOException;

/**
 * Created by lipeng on 16/1/6.
 */
public class DberMySqlParser {
//
    public static MySQLWalker.beg_return parse(String sql) throws RecognitionException, IOException {

        MySQLLexer pl = new MySQLLexer(new ANTLRInputStream(sql));
        CommonTokenStream tokens = new CommonTokenStream(pl);
        MySQLParser pa = new MySQLParser(tokens);
        pa.expression();
        CommonTree tree = (CommonTree) beg.getTree();

        if (logger.isDebugEnabled()) {
            logger.debug(tree.toStringTree());
        }

        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        nodes.setTokenStream(tokens);
        MySQLWalker walker = new MySQLWalker(nodes);
        walker.setGroupFunc(GroupFunctionRegister.reg);
        walker.setFunctionMap(FunctionRegister.funcReg);
        MySQLWalker.beg_return ret = walker.beg();

        ret.obj.setPos2TableName(walker.pos2TableName);

        return ret;

    }
}
