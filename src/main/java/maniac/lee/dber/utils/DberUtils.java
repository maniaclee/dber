package maniac.lee.dber.utils;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by lipeng on 16/1/3.
 */
public class DberUtils {

    @Deprecated
    public static void registBean(ApplicationContext context, Object bean, String id) {
        if (context.getBean(id) != null)
            return;
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(bean.getClass());
        beanDefinitionBuilder.addPropertyValue(id, bean);

        getDefaultListableBeanFactoryFromApplicationContext(context).registerBeanDefinition(id, beanDefinitionBuilder.getRawBeanDefinition());
    }

    public static DefaultListableBeanFactory getDefaultListableBeanFactoryFromApplicationContext(ApplicationContext context) {
        ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) context;
        return (DefaultListableBeanFactory) configurableApplicationContext.getBeanFactory();
    }

    public static void registSingleton(ConfigurableListableBeanFactory beanFactory, String id, Object bean) {
        beanFactory.registerSingleton(id, bean);
    }

    public static String generateBeanId(Class<?> clz ){
        return StringUtils.uncapitalize(clz.getSimpleName());
    }
}
