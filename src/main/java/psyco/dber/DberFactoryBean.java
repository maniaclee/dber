package psyco.dber;

import org.springframework.beans.factory.FactoryBean;

import java.util.Collections;
import java.util.List;

/**
 * Created by peng on 15/12/29.
 */
@Deprecated
public class DberFactoryBean implements FactoryBean<Dber> {
    Dber dber = new Dber();
    List<String> packageToScan = Collections.singletonList("psyco");

    public Dber getObject() throws Exception {
        dber.setDaoPackageToScan(packageToScan);
        return dber;
    }

    public List<String> getPackageToScan() {
        return packageToScan;
    }

    public void setPackageToScan(List<String> packageToScan) {
        this.packageToScan = packageToScan;
    }

    public Class<?> getObjectType() {
        return Dber.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
