package maniac.lee.dber.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.jdbc.core.JdbcTemplate;
import maniac.lee.dber.Dber;
import maniac.lee.dber.exception.DberException;
import maniac.lee.dber.utils.DberUtils;

import java.util.Map;

/**
 * Created by lipeng on 16/1/3.
 */
public class DberClient implements InitializingBean, ApplicationListener<ContextRefreshedEvent>, ApplicationContextAware, BeanFactoryPostProcessor {

    private ApplicationContext applicationContext;
    private Dber dber;

    public void registBean() throws DberException {
        /** create Dber if necessary */
        this.dber = applicationContext.getBean(Dber.class);
        if (dber == null) {
            this.dber = createDber();
            DberUtils.registSingleton(DberUtils.getDefaultListableBeanFactoryFromApplicationContext(applicationContext), "dber", dber);
        }
        if (!dber.isInited()) {

        }
        if (dber.getSqlDelegate() == null) {
            JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
            if (jdbcTemplate == null)
                throw new DberException("no SqlDelegate is found.");
            dber.setSqlDelegate(new SqlDelegateImpl(jdbcTemplate));
        }


        Map<Class<?>, Object> delegates = dber.getDelegates();
        if (delegates == null || delegates.isEmpty()) {
            throw new DberException("no delegates are found.");
        }
        for (Class<?> clz : delegates.keySet()) {
            DberUtils.registSingleton(DberUtils.getDefaultListableBeanFactoryFromApplicationContext(applicationContext), DberUtils.generateBeanId(clz), delegates.get(clz));
        }

    }

    private Dber createDber() {
        Dber dber = new Dber();
        //TODO
        return dber;
    }

    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            registBean();
        } catch (DberException e) {
            e.printStackTrace();
        }
    }

    public void afterPropertiesSet() throws Exception {
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    }

    public Dber getDber() {
        return dber;
    }

    public void setDber(Dber dber) {
        this.dber = dber;
    }
}
