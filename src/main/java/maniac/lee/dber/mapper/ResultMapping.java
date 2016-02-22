package maniac.lee.dber.mapper;

import java.util.List;

/**
 * Created by peng on 15/12/29.
 */
public interface ResultMapping {

   Object toObject(List jdbcResult);
}
