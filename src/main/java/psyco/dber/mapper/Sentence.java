package psyco.dber.mapper;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by peng on 15/12/29.
 */
public class Sentence {
    SqlDefinition sqlDefinition;
    List<ParameterMapper> parameterMappers;
    ResultMapping resultMapping;

    private static Pattern pattern = Pattern.compile("#\\{([^\\{\\}]+)\\}");

    public Object[] parseParameters(Object[] parameters) {
        return null;
    }

    private void parse() {
        Matcher m = pattern.matcher(sqlDefinition.getSql());
        while (m.find()) {
            String param = m.group(1);
//            m.re
        }
    }


    /**
     * only for insert
     */
    KeySelector keySelector;


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

    public KeySelector getKeySelector() {
        return keySelector;
    }

    public void setKeySelector(KeySelector keySelector) {
        this.keySelector = keySelector;
    }
}
