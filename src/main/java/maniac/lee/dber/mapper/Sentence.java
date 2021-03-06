package maniac.lee.dber.mapper;

import maniac.lee.dber.utils.ReflectionUtils;
import maniac.lee.dber.parser.dber.DberContext;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by peng on 15/12/29.
 */
public class Sentence {
    SqlDefinition sqlDefinition;
    Map<String, ParameterMapper> parameterMappers;
    ResultMapping resultMapping;
    Type returnType;
    DberContext dberContext;

    /**
     * only for insert
     */
    KeySelector keySelector;

    public Class findActualReturnType() {
        return ReflectionUtils.getGenericType(returnType, 0);
    }

    public Object[] parseParameters(Object[] parameters) {
        return null;
    }

    public Map<String, ParameterMapper> getParameterMappers() {
        return parameterMappers;
    }

    public void setParameterMappers(Map<String, ParameterMapper> parameterMappers) {
        this.parameterMappers = parameterMappers;
    }

    public ResultMapping getResultMapping() {
        return resultMapping;
    }

    public void setResultMapping(ResultMapping resultMapping) {
        this.resultMapping = resultMapping;
    }

    public SqlDefinition getSqlDefinition() {
        return sqlDefinition;
    }

    public void setSqlDefinition(SqlDefinition sqlDefinition) {
        this.sqlDefinition = sqlDefinition;
    }

    public KeySelector getKeySelector() {
        return keySelector;
    }

    public void setKeySelector(KeySelector keySelector) {
        this.keySelector = keySelector;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public DberContext getDberContext() {
        return dberContext;
    }

    public void setDberContext(DberContext dberContext) {
        this.dberContext = dberContext;
    }
}
