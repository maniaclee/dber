package psyco.dber.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.junit.Test;
import psyco.dber.parser.dber.DberBaseVisitor;
import psyco.dber.parser.dber.DberLexer;
import psyco.dber.parser.dber.DberParser;

import java.io.IOException;

/**
 * Created by lipeng on 16/1/6.
 */
public class DberSyntaxParser {

    public static void parse(String sql) throws RecognitionException, IOException {

        DberLexer pl = new DberLexer(new ANTLRInputStream(sql));
        CommonTokenStream tokens = new CommonTokenStream(pl);
        DberParser  parser = new DberParser(tokens);
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        try {
            DberParser.AllContext re = parser.all();  // STAGE 1
            System.out.println(ToStringBuilder.reflectionToString(re, ToStringStyle.MULTI_LINE_STYLE));
            new DberBaseVisitor<Object>().visit(re.getRuleContext());
        } catch (Exception ex) {
            tokens.reset(); // rewind input stream
            parser.reset();
            parser.getInterpreter().setPredictionMode(PredictionMode.LL);
            parser.all();  // STAGE 2
            // if we parse ok, it's LL not SLL
        }
    }

    @Test
    public void sdf() throws Exception {
//        parse("select * from a where #{a} > 2");
        parse("null f 3");
    }
}
