package com.example.spring_study.baseAnnotation.awareInterFace;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_Aware {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareTest.class);
        System.out.println("++++++"+applicationContext);
    }
}
