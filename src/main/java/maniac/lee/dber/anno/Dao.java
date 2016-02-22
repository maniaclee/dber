package maniac.lee.dber.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * Created by peng on 15/12/23.
 */
@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Dao {
}
