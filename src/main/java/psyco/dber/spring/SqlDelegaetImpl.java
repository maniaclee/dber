package psyco.dber.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import psyco.dber.mapper.Sentence;
import psyco.dber.mapper.SqlDelegate;
import psyco.dber.parser.EntityConvertor;
import psyco.dber.utils.ReflectionUtils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lipeng on 16/1/4.
 */
public class SqlDelegaetImpl implements SqlDelegate {
    JdbcTemplate template;
    EntityConvertor entityConvertor;
    private volatile boolean inited = false;

    public SqlDelegaetImpl(JdbcTemplate template) {
        this.template = template;
    }

    public List select(Sentence sentence, Object[] parameters) {
        if (!inited) {
            synchronized (this) {
                if (!inited) {
                    entityConvertor = new EntityConvertor(ReflectionUtils.getGenericType(sentence.getSqlDefinition().getReturnType(), 0));
                    inited = true;
                }
            }
        }
        return template.query(sentence.getSqlDefinition().getSql(), parameters, new EntityMapper<Object>());
    }

    private class EntityMapper<T> implements RowMapper<T> {

        public T mapRow(ResultSet rs, int rowNum) throws SQLException {
            ResultSetMetaData meta = rs.getMetaData();
            int count = meta.getColumnCount();
            try {
                Object re = entityConvertor.newInstance();
                for (int i = 1; i <= count; i++) {
                    Object col = rs.getObject(i);
                    if (col != null)
                        entityConvertor.setValue(meta.getColumnName(i),col, re);
                }
                return (T) re;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }


    public int update(Sentence sentence, Object[] parameters) {
        return template.update(sentence.getSqlDefinition().getSql(),parameters);
    }

    public int delete(Sentence sentence, Object[] parameters) {
        return delete(sentence,parameters);
    }

    public Object insert(Sentence sentence, Object[] parameters) {
        int re = update(sentence,parameters);

        return null;
    }
}
