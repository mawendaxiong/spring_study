package com.example.spring_study.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_Scope {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeTest.class);

        Object user1 = applicationContext.getBean("user02");
        Object user2 = applicationContext.getBean("user02");
        System.out.println(user1==user2);

        Object user3 = applicationContext.getBean("user01");
        Object user4 = applicationContext.getBean("user01");
        System.out.println(user3==user4);
    }
}
