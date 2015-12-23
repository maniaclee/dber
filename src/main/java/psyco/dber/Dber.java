package psyco.dber;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.util.ClassUtils;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by peng on 15/12/23.
 */
public class Dber implements ApplicationContextAware, InitializingBean {


    private List<String> daoPackageToScan;
    private ApplicationContext applicationContext;

    private Set<Class<?>> getClassSet(Class<? extends Annotation> annotation) {
        final String RESOURCE_PATTERN = "/**/*.class";
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Set<Class<?>> set = new TreeSet<Class<?>>();
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
                    try {
                        Class<?> clz = Class.forName(className);
                        if (clz.getAnnotation(annotation) != null) {
                            set.add(clz);
                        }
                    } catch (Exception e) {
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

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void afterPropertiesSet() throws Exception {
//        System.out.println(getClassSet(Dao.class));
    }
}
