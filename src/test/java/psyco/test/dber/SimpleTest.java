package psyco.test.dber;

import com.google.common.collect.Lists;
import org.junit.Test;

/**
 * Created by peng on 16/1/4.
 */
public class SimpleTest {

    @Test
    public void type() {
        Class t = Lists.newArrayList("sdf").getClass();
        System.out.println(t);
    }



}
