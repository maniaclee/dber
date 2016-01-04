package psyco.dber;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.util.ClassUtils;
import psyco.dber.anno.Dao;
import psyco.dber.mapper.MapperHolder;
import psyco.dber.mapper.ProxyFactory;
import psyco.dber.mapper.SpringProxyFactory;
import psyco.dber.mapper.SqlDelegate;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by peng on 15/12/23.
 */
public class Dber {

    private List<String> daoPackageToScan;

    private Map<Class<?>, Object> delegates = new ConcurrentHashMap<Class<?>, Object>();
    private ProxyFactory proxyFactory;
    private Set<Class<?>> clz;
    private boolean inited = false;
    private SqlDelegate sqlDelegate;

    public Dber() {
    }

    public <T> T getProxy(Class<T> clz) {
        return (T) delegates.get(clz);
    }

    public void initByPackageScan() throws Exception {
        clz = getClassSet(Dao.class);
        init();
    }

    public void init() throws Exception {
        proxyFactory = new SpringProxyFactory(sqlDelegate);
        MapperHolder.parse(clz);
        for (Class<?> c : clz) {
            delegates.put(c, proxyFactory.proxy(c));
        }
        this.inited = true;
    }


    private Set<Class<?>> getClassSet(Class<? extends Annotation> annotation) {
        final String RESOURCE_PATTERN = "/**/*.class";
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Set<Class<?>> set = new HashSet<Class<?>>();
        if (daoPackageToScan == null || this.daoPackageToScan.isEmpty()) {
            throw new RuntimeException("no package found");
        }
        for (String pkg : this.daoPackageToScan) {
            String pattern = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + ClassUtils.convertClassNameToResourcePath(pkg) + RESOURCE_PATTERN;
            Resource[] resources;
            try {
                resources = resourcePatternResolver.getResources(pattern);
            } catch (IOException e) {
                continue;
            }
            MetadataReaderFactory readerFactory = new CachingMetadataReaderFactory(resourcePatternResolver);
            for (Resource resource : resources) {
                if (resource.isReadable()) {
                    MetadataReader reader;
                    try {
                        reader = readerFactory.getMetadataReader(resource);
                    } catch (IOException e) {
                        continue;
                    }
                    String className = reader.getClassMetadata().getClassName();
                    System.out.println(className);
                    try {
                        Class<?> clz = Class.forName(className);
                        if (clz.getAnnotation(annotation) != null) {
                            set.add(clz);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        continue;
                    }
                }
            }
        }
        return set;
    }

    public List<String> getDaoPackageToScan() {
        return daoPackageToScan;
    }

    public void setDaoPackageToScan(List<String> daoPackageToScan) {
        this.daoPackageToScan = daoPackageToScan;
    }

    public Map<Class<?>, Object> getDelegates() {
        return delegates;
    }

    public void setDelegates(Map<Class<?>, Object> delegates) {
        this.delegates = delegates;
    }

    public boolean isInited() {
        return inited;
    }

    public SqlDelegate getSqlDelegate() {
        return sqlDelegate;
    }

    public void setSqlDelegate(SqlDelegate sqlDelegate) {
        this.sqlDelegate = sqlDelegate;
    }
}

