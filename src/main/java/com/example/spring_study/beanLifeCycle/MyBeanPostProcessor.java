package com.example.spring_study.beanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 这里均是在bean初始化的时候执行，可以在bean初始化的时候对bean进行一些操作
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * 初始化bean前执行
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(">>>>>>>>>>>>"+beanName+">>>>>>>>>>BeforeInit");
        return bean;
    }

    /**
     * 初始化bean后执行
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(">>>>>>>>>>>>"+beanName+">>>>>>>>>>AfterInit");
        return bean;
    }
}
