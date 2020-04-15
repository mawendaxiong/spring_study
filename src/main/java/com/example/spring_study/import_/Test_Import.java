package com.example.spring_study.import_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_Import {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportTest.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
    }
}
