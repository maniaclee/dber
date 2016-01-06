package psyco.dber.mapper;

import com.google.common.collect.Lists;
import psyco.dber.exception.MappingException;
import psyco.dber.utils.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by peng on 15/12/29.
 */
public class MapperHolder {

    static Map<String, Sentence> mappers = new ConcurrentHashMap<String, Sentence>();

    public static void parse(Set<Class<?>> clz) throws MappingException {
        for (Class<?> c : clz) {
            for (Method m : c.getDeclaredMethods()) {
                SqlDefinition sqlDefinition = SqlDefinition.parse(m);
                if (sqlDefinition != null) {
                    Sentence sentence = addMapping(sqlDefinition);
                    Parameter[] params = m.getParameters();
                    if (params == null || params.length == 0)
                        continue;

                    List<ParameterMapper>  pms = Lists.newLinkedList();

//                    List<ParameterMapper> ms = createParameters(m);
//                    sentence.setParameterMappers(ms);
                }

            }
        }
    }

    private static List<ParameterMapper> createParameters(Method m) {
        return ReflectionUtils.getParameterNames(m).stream().map(name -> new ParameterMapper(name)).collect(Collectors.toList());
    }


    public static Map<String, Sentence> getMappers() {
        return mappers;
    }

    private static Sentence addMapping(SqlDefinition sqlDefinition) {
        Sentence sentence = new Sentence();
        sentence.setSqlDefinition(sqlDefinition);
        sentence.setResultMapping(new BeanResultMappingHandler());
        mappers.put(sentence.getSqlDefinition().getSqlId(), sentence);
        return sentence;
    }

}
