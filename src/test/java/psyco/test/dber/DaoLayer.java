package psyco.test.dber;

import maniac.lee.dber.anno.*;
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

    @Select("select * from User where name = #name ")
    List<User> findByName(@Param("name") String name);

    @Select({"select * from User where name = #name ",
            "if{#level !=null ->  and level = #level }"})
    List<User> findByNameAndLevel(@Param("name") String name, @Param("level") Integer level);

    @Update("update User set level = $level where id = $id")
    int updateLevelById(@Param("id") long id, @Param("level") Integer level);


    @Key
    @Insert(" insert into User(name,sex,email) values($user.name,$user.sex,$user.email)")
    long insert(@Param("user") User user);

    @Key(customSql = "$user.id")
    @Insert(" insert into User(id,name,sex,email) values($user.id,$user.name,$user.sex,$user.email)")
    long insertWithId(@Param("user") User user);


    //    @Select({"select * from User where id in #{ids}",
    //            "if{status>0 && status != 1-> and status = #{status} else-> } ",
    //            "if{status<=0 } -> and status = #{status}",
    //            "if{offset != null && length !=null } -> limit #{offset} , #{count}"})
    //    List<User> findByList(List<Long> ids, Integer status, Integer offset, Integer length);


}
