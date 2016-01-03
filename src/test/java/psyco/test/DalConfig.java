package psyco.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import psyco.dber.Dber;

import javax.sql.DataSource;
import java.util.Collections;

/**
 *
 */
@Configuration
public class DalConfig {

    @Bean
    public DriverManagerDataSource driverManagerDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/user?characterEncoding=UTF-8");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("");
        return driverManagerDataSource;
    }

    @Bean(initMethod = "initByPackageScan")
    public Dber dber(){
        Dber dber = new Dber();
        dber.setDaoPackageToScan(Collections.singletonList("psyco"));
        return dber;
    }
//    @Bean
//    public DberFactoryBean dber() {
//        DberFactoryBean dber = new DberFactoryBean();
//        dber.setPackageToScan(Collections.singletonList("psyco"));
//        return dber;
//    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource driverManagerDataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(driverManagerDataSource);
        return jdbcTemplate;
    }


}
