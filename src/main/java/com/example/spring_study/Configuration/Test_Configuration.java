package com.example.spring_study.Configuration;

import com.example.spring_study.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_Configuration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationTest.class);

        //根据类型获取所有的bean
        User user = applicationContext.getBean(User.class);
        System.out.println(user);

        //获取类型获取bean的名字
        String[] beanNamesForType = applicationContext.getBeanNamesForType(User.class);
        for (String type:beanNamesForType){
            System.out.println(type);
        }
    }
}
