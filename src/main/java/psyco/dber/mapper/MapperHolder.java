package psyco.dber.mapper;

import psyco.dber.exception.MappingException;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by peng on 15/12/29.
 */
public class MapperHolder {

    static Map<String, Sentence> mappers = new ConcurrentHashMap<String, Sentence>();

    public static void parse(Set<Class<?>> clz) throws MappingException {
        for (Class<?> c : clz) {
            for (Method m : c.getDeclaredMethods()) {
                SqlDefinition sqlDefinition = SqlDefinition.parse(m);
                if (sqlDefinition != null)
                    addMapping(sqlDefinition);

            }
        }
    }

    public static Map<String, Sentence> getMappers() {
        return mappers;
    }

    private static void addMapping(SqlDefinition sqlDefinition) {
        Sentence sentence = new Sentence();
        sentence.setSqlDefinition(sqlDefinition);
        //TODO
        sentence.setParameterMappers(null);
        sentence.setResultMapping(new BeanResultMappingHandler());
        mappers.put(sentence.getSqlDefinition().getSqlId(), sentence);
    }

}
