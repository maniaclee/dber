package maniac.lee.dber.parser;

import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.util.Optional;

/**
 * Created by peng on 16/1/4.
 */
public class EntityConvertor {
    Class<?> clz;
    public EntityConvertor(Class<?> clz) {
        this.clz = clz;
    }

    public Object newInstance() throws Exception {
        return  clz.newInstance();
    }

    public void setValue(String field, Object value, Object des) {
        Optional<Field> member = Lists.newArrayList(des.getClass().getDeclaredFields()).stream()
                .filter(f -> f.getName().toLowerCase().contentEquals(field.replaceAll("[^a-zA-Z0-9]]", "")))
                .findFirst();
        if (member.isPresent()) {
            Field ff = member.get();
            ff.setAccessible(true);
            try {
                ff.set(des,value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
