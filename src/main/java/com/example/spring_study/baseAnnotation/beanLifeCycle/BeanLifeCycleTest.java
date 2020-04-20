package com.example.spring_study.baseAnnotation.beanLifeCycle;

import com.example.spring_study.baseAnnotation.beanLifeCycle.vo.DemoBean;
import com.example.spring_study.baseAnnotation.beanLifeCycle.vo.DemoBean2;
import com.example.spring_study.baseAnnotation.beanLifeCycle.vo.DemoBean3;
import org.springframework.context.annotation.*;

/**
 * MyBeanPostProcessor 在bean初始化的时候对bean进行一些操作
 */
@Import({DemoBean2.class, DemoBean3.class,MyBeanPostProcessor.class})
@Configuration
public class BeanLifeCycleTest {
    /**
     * 注意：在多实例的情况下，容器启动的时候不会调用类的构造方法，
     * 并且容器销毁的时候，不会执行销毁方法
     */

    /**
     * 1.通过@Bean 的initMethod 和 destroyMethod 来定义初始化方法和销毁方法
     * 2.通过实现 InitializingBean 和 DisposableBean 接口来定义初始化和销毁方法，详见 DemoBean2.class
     * 3.通过 @PostConstruct(初始化) 和 @PreDestroy（销毁） 来定义，详见DemoBean3.class
     *
     * 本测试例子是通过@Import将DemoBean2 和 详见DemoBean3 导入到容器中
     */
    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destory")
    public DemoBean demoBean() {
        return new DemoBean();
    }

}
