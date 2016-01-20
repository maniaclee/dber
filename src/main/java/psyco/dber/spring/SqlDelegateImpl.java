package psyco.dber.spring;

import com.google.common.collect.Maps;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import psyco.dber.mapper.Sentence;
import psyco.dber.mapper.SqlDelegate;
import psyco.dber.parser.EntityConvertor;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by lipeng on 16/1/4.
 */
public class SqlDelegateImpl implements SqlDelegate {
    JdbcTemplate template;
    private Map<Class, BeanPropertyRowMapper> rowMapperMap = Maps.newConcurrentMap();

    public SqlDelegateImpl(JdbcTemplate template) {
        this.template = template;
    }

    public List select(Sentence sentence, Object[] parameters) {
        return template.query(sentence.getSqlDefinition().getSql(), parameters, findRowMapperByClass(sentence.findActualReturnType()));
    }

    public Object load(Sentence sentence, Object[] parameters) {
        List re = select(sentence, parameters);
        if (re == null || re.isEmpty())
            return null;
        return re.get(0);
    }

    public int update(Sentence sentence, Object[] parameters) {
        return template.update(sentence.getSqlDefinition().getSql(), parameters);
    }

    public int delete(Sentence sentence, Object[] parameters) {
        return delete(sentence, parameters);
    }

    public Object insert(Sentence sentence, Object[] parameters) {
        int re = update(sentence, parameters);
        return null;
    }

    private BeanPropertyRowMapper findRowMapperByClass(Class clz) {
        BeanPropertyRowMapper re = rowMapperMap.get(clz);
        if (re == null) {
            re = new BeanPropertyRowMapper(clz);
            rowMapperMap.put(clz, re);
        }
        return re;
    }

    @Deprecated
    private class EntityMapper<T> implements RowMapper<T> {
        EntityConvertor entityConvertor;

        public T mapRow(ResultSet rs, int rowNum) throws SQLException {
            ResultSetMetaData meta = rs.getMetaData();
            int count = meta.getColumnCount();
            try {
                Object re = entityConvertor.newInstance();
                for (int i = 1; i <= count; i++) {
                    Object col = rs.getObject(i);
                    if (col != null)
                        entityConvertor.setValue(meta.getColumnName(i), col, re);
                }
                return (T) re;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
