package psyco.dber.mapper;

import java.util.List;

/**
 * Created by peng on 15/12/29.
 */
public class Sentence {
    SqlDefinition sqlDefinition;
    List<ParameterMapper> parameterMappers;
    ResultMapping resultMapping;


    public List<ParameterMapper> getParameterMappers() {
        return parameterMappers;
    }

    public void setParameterMappers(List<ParameterMapper> parameterMappers) {
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
}
