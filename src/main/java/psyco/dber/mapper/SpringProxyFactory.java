package psyco.dber.mapper;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * Created by peng on 15/12/29.
 */
public class SpringProxyFactory implements ProxyFactory {


    public <T> T proxy(Class<T> clz) throws Exception {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setProxyInterfaces(new Class[]{clz});
        proxyFactoryBean.addAdvice(new DaoMethodInterceptor());
        return (T) proxyFactoryBean.getObject();
    }

    private static class DaoMethodInterceptor implements MethodInterceptor {
        private SqlDelegate sqlDelegate;

        public Object invoke(MethodInvocation methodInvocation) throws Throwable {
            SqlDefinition sql = SqlDefinition.parse(methodInvocation.getMethod());
            Sentence sentence = MapperHolder.getMappers().get(sql.getSqlId());
            Object[] args = methodInvocation.getArguments();
            switch (sentence.getSqlDefinition().getType()) {
                case Insert:
                    return sqlDelegate.insert(sentence, args);
                case Select:
                    return sqlDelegate.select(sentence, args);
                case Update:
                    return sqlDelegate.update(sentence, args);
                case Delete:
                    return sqlDelegate.delete(sentence, args);
            }
            return null;
        }
    }
}
