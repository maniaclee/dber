package psyco.dber.mapper;

/**
 * Created by peng on 15/12/29.
 */
public interface ProxyFactory {

    <T> T proxy(Class<T> clz);
}
