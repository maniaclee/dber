package maniac.lee.dber.mapper;

import maniac.lee.dber.anno.Param;

/**
 * Created by peng on 15/12/29.
 */
public class ParameterMapper {

    public int index;
    public String name;
    public int parameterType = Param.COMMON;

    public ParameterMapper(String name) {
        this.name = name;
    }

    public ParameterMapper(int index, String name) {
        this.index = index;
        this.name = name;
    }
}
