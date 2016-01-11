package psyco.test.dber;

import com.google.common.collect.Lists;
import org.junit.Test;
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
    public String  test(){

        return null;
    }


    @Test
    public void testResultType() throws NoSuchMethodException {
        Method m = SimpleTest.class.getDeclaredMethod("test", null);
        System.out.println(m.getReturnType().getClass().getName());
        System.out.println(m.getGenericReturnType() );
        ParameterizedType t = (ParameterizedType) m.getGenericReturnType();
        System.out.println(t.getActualTypeArguments());
        System.out.println(ReflectionUtils.getGenericType(t,0));
    }


}
