package com.example.spring_study.baseAnnotation.componentScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_ComponentScan {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanTest.class);

        //获取所有bean的名字
       String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
    }
}
