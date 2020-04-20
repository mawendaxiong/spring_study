package com.example.spring_study.baseAnnotation.beanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_BeanLifeCycle {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanLifeCycleTest.class);
        applicationContext.getBean("demoBean");
        applicationContext.close();
    }
}
