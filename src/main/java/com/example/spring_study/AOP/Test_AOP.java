package com.example.spring_study.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_AOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AOP_Config.class);
        SimpleMethod bean = applicationContext.getBean(SimpleMethod.class);
        bean.div(1, 1);

    }
}
