package psyco.test.dber;

import psyco.dber.anno.Dao;
import psyco.dber.anno.Select;
import psyco.test.dber.entity.User;

import java.util.List;

/**
 * Created by peng on 15/12/23.
 */
@Dao
public interface DaoLayer {

    @Select("select * from User")
    List<User> find();
}
