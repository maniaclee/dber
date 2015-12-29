package psyco.dber.mapper;

import java.util.List;

/**
 * Created by peng on 15/12/29.
 */
public interface SqlDelegate {

    List select();
    int update();

}
