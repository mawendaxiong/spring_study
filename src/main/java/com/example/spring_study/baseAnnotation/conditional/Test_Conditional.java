package com.example.spring_study.baseAnnotation.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_Conditional {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionalTest.class);

    }
}
