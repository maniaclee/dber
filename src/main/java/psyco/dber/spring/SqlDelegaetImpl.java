package psyco.dber.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import psyco.dber.mapper.Sentence;
import psyco.dber.mapper.SqlDelegate;
import psyco.dber.utils.ReflectionUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lipeng on 16/1/4.
 */
public class SqlDelegaetImpl implements SqlDelegate {
    JdbcTemplate template;

    public SqlDelegaetImpl(JdbcTemplate template) {
        this.template = template;
    }

    public List select(Sentence sentence, Object[] parameters) {
        Class clz = ReflectionUtils.getGenericType(sentence.getSqlDefinition().getReturnType(), 0);
        System.out.println("select what the fuck");
        template.query(sentence.getSqlDefinition().getSql(), parameters, new RowMapper<Object>() {
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                //TODO
                return null;
            }
        });
        return template.queryForList(sentence.getSqlDefinition().getSql(),clz,parameters);
    }

    public int update(Sentence sentence, Object[] parameters) {
        return 0;
    }

    public int delete(Sentence sentence, Object[] parameters) {
        return 0;
    }

    public Object insert(Sentence sentence, Object[] parameters) {
        return null;
    }
}
