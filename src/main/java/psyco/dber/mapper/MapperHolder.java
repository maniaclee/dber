package psyco.dber.mapper;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import psyco.dber.anno.Key;
import psyco.dber.anno.Param;
import psyco.dber.exception.MappingException;
import psyco.dber.utils.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by peng on 15/12/29.
 */
public class MapperHolder {

    static Map<String, Sentence> mappers = new ConcurrentHashMap<String, Sentence>();

    public static void parse(Set<Class<?>> clz) throws MappingException {
        for (Class<?> c : clz)
            for (Method m : c.getDeclaredMethods())
                addMapping(SqlDefinition.parse(m), m);
    }

    private static Sentence addMapping(SqlDefinition sqlDefinition, Method m) {
        if (sqlDefinition == null)
            return null;

        Sentence sentence = new Sentence();
        sentence.setSqlDefinition(sqlDefinition);
        sentence.setReturnType(m.getReturnType());
        /** parameter mappings  */
        sentence.setParameterMappers(createParameters(m));
        if (m.getAnnotation(Key.class) != null)
            sentence.setKeySelector(new KeySelector(m.getAnnotation(Key.class)));

        /** register to mappers */
        mappers.put(sentence.getSqlDefinition().getSqlId(), sentence);
        return sentence;
    }

    private static Map<String, ParameterMapper> createParameters(Method m) {
        Map<String, ParameterMapper> result = Maps.newHashMap();
        Parameter[] params = m.getParameters();
        if (params == null || params.length == 0)
            return result;

        /** plan A */
        List<String> re = ReflectionUtils.getParameterNames(m);
        for (int i = 0; i < re.size(); i++) {
            String name = re.get(i);
            result.put(name, new ParameterMapper(i, name));
        }

        /** plan B */
        if (result.isEmpty()) {
            Parameter[] ps = m.getParameters();
//            Annotation[][] parameterAnnotations = m.getParameterAnnotations();
//            for (int i = 0; i <parameterAnnotations.length ; i++) {
//                Annotation[] annotations = parameterAnnotations[i];
//                for(Annotation annotation : annotations){
//                    if(annotation instanceof Param){
//                        String paramName = ((Param) annotation).value();
//                        result.put(paramName, new ParameterMapper(i, paramName));
//                    }
//                }
//            }

            for (int i = 0; i < ps.length; i++) {
                Parameter p = ps[i];
                Param param = p.getAnnotation(Param.class);
                if (param != null) {
                    result.put(param.value(), new ParameterMapper(i, param.value()));
                }
            }
            Preconditions.checkArgument(result.isEmpty() || result.size() == ps.length,"parameter mapping with @Param numbers are not right :" + m.getName());
        }
        return result;
    }


    public static Map<String, Sentence> getMappers() {
        return mappers;
    }


}
