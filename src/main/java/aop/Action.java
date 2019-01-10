package aop;

import java.lang.annotation.*;

/**
 * Created by kangyl17909 on 2019/1/6.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
