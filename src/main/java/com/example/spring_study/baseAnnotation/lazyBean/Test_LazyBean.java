package com.example.spring_study.baseAnnotation.lazyBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_LazyBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LazyBeanTest.class);
        Object user1 = applicationContext.getBean("user1");
        Object user2 = applicationContext.getBean("user1");
        System.out.println(user1==user2);
    }
}
