package psyco.test.dber;

import psyco.dber.anno.Dao;
import psyco.dber.anno.Param;
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

    @Select("select * from User where id < ?")
    List<User> find(long id);

    @Select("select * from User where name = #{name} ")
    List<User> findByName(@Param("name") String name);

    @Select({"select * from User where id in (#{ids})",
            "if{status>0, and status = #{status} }",
            "if{status<=0, and status = #{status} }",
            "limit #{offset} , #{count}"})
    List<User> findByList(@Param("ids") List<Long> ids, Integer status, int offset, int length);
}
