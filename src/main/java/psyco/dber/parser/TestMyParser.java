package psyco.dber.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.junit.Test;
import psyco.dber.parser.test.TestLexer;
import psyco.dber.parser.test.TestParser;

import java.io.IOException;

/**
 * Created by lipeng on 16/1/6.
 */
public class TestMyParser {

    public static void parse(String sql) throws RecognitionException, IOException {

        TestLexer pl = new TestLexer(new ANTLRInputStream(sql));
        CommonTokenStream tokens = new CommonTokenStream(pl);
        TestParser parser = new TestParser(tokens);
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        try {
//            TestParser.StatContext re = parser.stat();  // STAGE 1
//            System.out.println(ToStringBuilder.reflectionToString(re, ToStringStyle.MULTI_LINE_STYLE));
            System.out.printf(ToStringBuilder.reflectionToString(parser.tell().predicts().predict(), ToStringStyle.MULTI_LINE_STYLE));
//            new TestBaseVisitor<Object>().visit(re.getRuleContext());
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
//        parse("select * from a where #{a} > 2");
        parse("3 > 3 or 4 < 4 and 23 <= 233");
    }
}
