package psyco.dber.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import psyco.dber.Dber;
import psyco.dber.exception.DberException;
import psyco.dber.utils.DberUtils;

import java.util.Map;

/**
 * Created by lipeng on 16/1/3.
 */
public class DberClient implements InitializingBean, ApplicationListener<ContextRefreshedEvent>, ApplicationContextAware, BeanFactoryPostProcessor {

    private ApplicationContext applicationContext;
    private Dber dber;

    public void registBean() throws DberException {
        /** create Dber if necessary */
        if (dber == null || applicationContext.getBean(Dber.class) == null) {
            this.dber = createDber();
            DberUtils.registSingleton(DberUtils.getDefaultListableBeanFactoryFromApplicationContext(applicationContext), "dber", dber);
        }
        if (!dber.isInited()) {

        }


        Map<Class<?>, Object> delegates = dber.getDelegates();
        if (delegates == null || delegates.isEmpty()) {
            throw new DberException("no delegates are found.");
        }
        for (Class<?> clz : delegates.keySet()) {
            DberUtils.registSingleton(DberUtils.getDefaultListableBeanFactoryFromApplicationContext(applicationContext), null, delegates.get(clz));
        }

    }

    private Dber createDber() {
        Dber dber = new Dber();
        return dber;
    }

    public void onApplicationEvent(ContextRefreshedEvent event) {
    }

    public void afterPropertiesSet() throws Exception {
        registBean();
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
