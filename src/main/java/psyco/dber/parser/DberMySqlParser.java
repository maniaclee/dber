package psyco.dber.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.junit.Test;
import psyco.dber.parser.gen.MySQLLexer;
import psyco.dber.parser.gen.MySQLParser;

import java.io.IOException;

/**
 * Created by lipeng on 16/1/6.
 */
public class DberMySqlParser {

    public static void parse(String sql) throws RecognitionException, IOException {

        MySQLLexer pl = new MySQLLexer(new ANTLRInputStream(sql));
        CommonTokenStream tokens = new CommonTokenStream(pl);
        MySQLParser parser = new MySQLParser(tokens);
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        try {
            MySQLParser.StatContext re = parser.stat();  // STAGE 1
            System.out.println(ToStringBuilder.reflectionToString(re, ToStringStyle.MULTI_LINE_STYLE));
        } catch (Exception ex) {
            tokens.reset(); // rewind input stream
            parser.reset();
            parser.getInterpreter().setPredictionMode(PredictionMode.LL);
            parser.stat();  // STAGE 2
            // if we parse ok, it's LL not SLL
        }
    }

    @Test
    public void sdf() throws Exception {
        parse("select * from a where a > 2");
    }
}
