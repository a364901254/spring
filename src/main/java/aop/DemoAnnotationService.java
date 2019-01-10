package aop;

import org.springframework.stereotype.Service;

/**
 * Created by kangyl17909 on 2019/1/6.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
   public void add(){};
}
