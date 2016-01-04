package psyco.dber.parser;

/**
 * Created by peng on 16/1/4.
 */
@Deprecated
public class TypeConvertor {

    public static Object convert(String className , Object object){
        if(object==null)
            return object;
        if(equalsTo(String.class,className)){
            return object.toString();
        }
        if(object.getClass().isPrimitive())
            return object;
        return null;
    }
    private static boolean equalsTo(Class clz , String className){
        return clz.getName().equals(className);
    }
}
