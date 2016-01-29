package psyco.test.dber;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import psyco.dber.parser.dber.DberContext;
import psyco.test.DalConfig;
import psyco.test.dber.entity.User;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by peng on 15/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan(basePackages = "psyco")
@Configuration
@EnableTransactionManagement
@ContextConfiguration(classes = {DalConfig.class})
public class TestCase {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Resource
    DaoLayer daoLayer;


    private void print(Object p){
        System.out.println(ToStringBuilder.reflectionToString(p));
        if(p instanceof  Iterable){
            Iterator i =  ((Iterable) p).iterator();
            while(i.hasNext())
                System.out.println(ToStringBuilder.reflectionToString(i.next()));
        }
    }
    @Test
    public void find(){
        print(daoLayer.find());
    }
    @Test
    public void find2(){
        print(daoLayer.find(22));
    }

    @Test
    public void findByNameAndLevel(){
        print(daoLayer.find(22));
    }
    @Test
    public void update(){
        print(daoLayer.updateLevelById(22,-1));
    }

    @Test
    public void insert(){

    }

    @Test
    public void sdfs() {
        //        List<Map<String, Object>> a = jdbcTemplate.queryForList("select * from User");
        ////        List<User> a = jdbcTemplate.queryForList("select * from User",User.class);
        //        for (Object m : a) {
        //            System.out.println(m);
        //        }
        //        System.out.println(a);
//        for (User u : daoLayer.find(41)) {
//        for (User u : daoLayer.findByName("root")) {
        User user = new User();
        user.setEmail("shitemail");
        user.setName("test-insert");
        user.setSex(1);
//        System.out.println(daoLayer.insert(user));
//        List<User> re =daoLayer.findByName("root");
//        System.out.println(re.get(0));
    }

}
