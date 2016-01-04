package psyco.dber.utils;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by peng on 16/1/4.
 */
public class ReflectionUtils {

    public static Class getMethodGenericReturnType(Method method, int index) {
        return getGenericType(method.getGenericReturnType(), index);
    }

    public static Class getGenericType(Type returnType, int index) {
        if (returnType instanceof ParameterizedType) {
            ParameterizedType type = (ParameterizedType) returnType;
            Type[] typeArguments = type.getActualTypeArguments();
            if (index >= typeArguments.length || index < 0) {
                throw new RuntimeException("invalid index : " + index);
            }
            return (Class) typeArguments[index];
        }
        return null;
    }
}