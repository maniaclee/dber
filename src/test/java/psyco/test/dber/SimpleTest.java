package psyco.test.dber;

import com.google.common.collect.Lists;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import psyco.dber.parser.dber.DberContext;
import psyco.dber.utils.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

/**
 * Created by peng on 16/1/4.
 */
public class SimpleTest {

    @Test
    public void type() {
        Class t = Lists.newArrayList("sdf").getClass();
        System.out.println(t);
    }

    //    public List<String>  test(){
    public String test() {

        return null;
    }

    @Test
    public void context() throws Exception {
        //        String s = "select * from ${tableName.shit} where  if{a >3 && b < 3 || 3 < 6  -> status = #{status}  else ->  id > #{id}} shit";
        String s = "select * from User";
        DberContext ct = DberContext.getInstance(s,null);
        DberContext.ParseHandler re = ct.parse(new Object[]{});
        System.out.println(ToStringBuilder.reflectionToString(re));
    }

    @Test
    public void testResultType() throws NoSuchMethodException {
        Method m = SimpleTest.class.getDeclaredMethod("test", null);
        System.out.println(m.getReturnType().getClass().getName());
        System.out.println(m.getGenericReturnType());
        ParameterizedType t = (ParameterizedType) m.getGenericReturnType();
        System.out.println(t.getActualTypeArguments());
        System.out.println(ReflectionUtils.getGenericType(t, 0));
    }


}
