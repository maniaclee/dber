package psyco.dber.parser;

import org.antlr.v4.runtime.misc.TestRig;
import org.junit.Test;

/**
 * Created by lipeng on 16/1/6.
 */
public class DberMySqlParser {
//
//    public static MySQLWalker.beg_return parse(String sql) throws RecognitionException, IOException {
//
//        MySQLLexer pl = new MySQLLexer(new ANTLRInputStream(sql));
//        CommonTokenStream tokens = new CommonTokenStream(pl);
//        MySQLParser pa = new MySQLParser(tokens);
//        CommonTree tree = (CommonTree) beg.getTree();
//
//        if (logger.isDebugEnabled()) {
//            logger.debug(tree.toStringTree());
//        }
//
//        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
//        nodes.setTokenStream(tokens);
//        MySQLWalker walker = new MySQLWalker(nodes);
//        walker.setGroupFunc(GroupFunctionRegister.reg);
//        walker.setFunctionMap(FunctionRegister.funcReg);
//        MySQLWalker.beg_return ret = walker.beg();
//
//        ret.obj.setPos2TableName(walker.pos2TableName);
//
//        return ret;
//
//    }
    @Test
    public void sdf() throws Exception {
        TestRig.main("Java8 -gui".split("\\s+"));
    }
}
