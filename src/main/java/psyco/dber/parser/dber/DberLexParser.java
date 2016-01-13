package psyco.dber.parser.dber;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import psyco.dber.parser.dber.lex.DberLexer;
import psyco.dber.parser.dber.lex.DberParser;

/**
 * Created by lipeng on 16/1/12.
 */
public class DberLexParser {

    public static DberContext parse(String input) throws Exception {
        DberLexer lexer = new DberLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DberParser parser = new DberParser(tokens);
        DberParser.SentenceContext tree = parser.sentence(); // parse a compilationUnit
//        DberParserListener extractor = new DberParserListener();
//        ParseTreeWalker.DEFAULT.walk(extractor, tree);
        return new DberContext(tree, input);
    }


    @Test
    public void test() throws Exception {
        String s = "select * from ${tableName.shit} where  if{a >3 && b < 3 || 3 < 6  -> status = #{status}  else ->  id > #{id}} shit";
        DberContext ct = parse(s);
    }

}
