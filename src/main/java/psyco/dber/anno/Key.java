package psyco.dber.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

/**
 * Created by peng on 15/12/23.
 */
@Target({METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Key {
    String customSql() default "";
}
