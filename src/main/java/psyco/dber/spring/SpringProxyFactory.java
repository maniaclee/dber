package psyco.dber.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactoryBean;
import psyco.dber.exception.DberException;
import psyco.dber.mapper.*;

import java.lang.reflect.Type;
import java.util.Objects;

/**
 * Created by peng on 15/12/29.
 */
public class SpringProxyFactory implements ProxyFactory {


    private final SqlDelegate sqlDelegate;

    public SpringProxyFactory() throws Exception {
        this(null);
    }

    public SpringProxyFactory(SqlDelegate sqlDelegate) throws Exception {
        if (sqlDelegate == null)
            throw new DberException("no SqlDelegate are found.");
        this.sqlDelegate = sqlDelegate;
    }

    public <T> T proxy(Class<T> clz) throws Exception {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setProxyInterfaces(new Class[]{clz});
        proxyFactoryBean.addAdvice(new DaoMethodInterceptor());
        return (T) proxyFactoryBean.getObject();
    }

    private class DaoMethodInterceptor implements MethodInterceptor {

        public Object invoke(MethodInvocation methodInvocation) throws Throwable {
            Object re = exec(methodInvocation);
            Type returnType = methodInvocation.getMethod().getGenericReturnType();
            /** handle void */
            if (Objects.equals(void.class, returnType))
                return null;
            return re;
        }

        private Object exec(MethodInvocation methodInvocation) throws Exception {
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
                case Load:
                    return sqlDelegate.load(sentence, args);
            }
            throw new DberException("no impl is found: " + methodInvocation.getMethod().getName());
        }
    }
}
