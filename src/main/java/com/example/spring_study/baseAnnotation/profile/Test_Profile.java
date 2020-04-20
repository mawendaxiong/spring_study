package com.example.spring_study.baseAnnotation.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * type-1 在jvm启动参数中加上 -Dspring.profiles.active=test  来切换环境，更换对应的bean
 * type-2 使用无参构造容器，手动改变容器的环境配置
 */
public class Test_Profile {
    //type-1
/*    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProfileTest.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }*/

    //type-2
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ProfileTest.class);
        applicationContext.getEnvironment().setActiveProfiles("prod");
        applicationContext.refresh();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
