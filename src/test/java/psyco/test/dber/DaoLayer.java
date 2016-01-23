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

    @Select({"select * from User where name = #{name} ",
            "if{level !=null ->  and level = #{level} }"})
    List<User> findByNameAndLevel(@Param("name") String name, @Param("level") Integer level);

//    @Select({"select * from User where id in #{ids}",
//            "if{status>0 && status != 1-> and status = #{status} else-> } ",
//            "if{status<=0 } -> and status = #{status}",
//            "if{offset != null && length !=null } -> limit #{offset} , #{count}"})
//    List<User> findByList(List<Long> ids, Integer status, Integer offset, Integer length);


}
