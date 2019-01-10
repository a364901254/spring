package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by kangyl17909 on 2019/1/6.
 */
@Configuration
@ComponentScan("*")
@EnableAspectJAutoProxy//开启Spring对AspectJ的支持
public class AopConfig {

}
