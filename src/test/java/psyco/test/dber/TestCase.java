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
import psyco.test.DalConfig;
import psyco.test.dber.entity.User;

import javax.annotation.Resource;
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


    @Test
    public void sdfs() {
        //        List<Map<String, Object>> a = jdbcTemplate.queryForList("select * from User");
        ////        List<User> a = jdbcTemplate.queryForList("select * from User",User.class);
        //        for (Object m : a) {
        //            System.out.println(m);
        //        }
        //        System.out.println(a);
        for (User u : daoLayer.find(41)) {
            //        for(User u : daoLayer.findByName("root")){
            System.out.println(ToStringBuilder.reflectionToString(u));
        }
        List<User> re =daoLayer.findByName("root");
        System.out.println(re.get(0));
    }
}
