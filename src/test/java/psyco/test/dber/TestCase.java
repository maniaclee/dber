package psyco.test.dber;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import psyco.dber.Dber;
import psyco.test.DalConfig;

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
@ContextConfiguration(classes = {Dber.class, DalConfig.class})
public class TestCase {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Resource
    private Dber dber;
//    @Resource
//    DaoLayer daoLayer;

    @Test
    public void sdfs() {
        List<Map<String, Object>> a = jdbcTemplate.queryForList("select * from User");
        for (Object m : a) {
            System.out.println(m);
        }

        System.out.println(a);
        System.out.println(dber.getDaoPackageToScan());
    }
}
