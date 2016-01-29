package psyco.dber.mapper;

import com.google.common.base.Joiner;
import psyco.dber.anno.*;
import psyco.dber.exception.MappingException;

import java.lang.reflect.Method;

/**
 * Created by peng on 15/12/29.
 */
public class SqlDefinition {
    String sqlId;
    String sql;
    SqlType type;

    public static SqlDefinition parse(Method m) throws MappingException {
        String sql = null;
        SqlType type = null;
        if (m.getAnnotation(Insert.class) != null) {
            sql = m.getAnnotation(Insert.class).value();
            type = SqlType.Insert;
        } else if (m.getAnnotation(Select.class) != null) {
            sql = Joiner.on(' ').join(m.getAnnotation(Select.class).value());
            type = SqlType.Select;
        } else if (m.getAnnotation(Update.class) != null) {
            sql = m.getAnnotation(Update.class).value();
            type = SqlType.Update;
        } else if (m.getAnnotation(Delete.class) != null) {
            sql = m.getAnnotation(Delete.class).value();
            type = SqlType.Delete;
        } else if (m.getAnnotation(Load.class) != null) {
            sql = m.getAnnotation(Load.class).value();
            type = SqlType.Load;
        }
        if (sql == null)
            return null;
        //            throw new MappingException(String.format("method %s must annotated with Insert/Update/Select/Delete", m.getName()));
        SqlDefinition sqlDefinition = new SqlDefinition();
        sqlDefinition.setSql(sql);
        sqlDefinition.setSqlId(generateId(m));
        sqlDefinition.setType(type);
        return sqlDefinition;
    }

    public static String generateId(Method m) {
//        System.out.println(m.toGenericString());
//        System.out.println(m.getName());
//        System.out.println(m.toString());
//        return m.getDeclaringClass().getName() + "#" + m.getName();
        return m.toGenericString();
    }

    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SqlType getType() {
        return type;
    }

    public void setType(SqlType type) {
        this.type = type;
    }

}
