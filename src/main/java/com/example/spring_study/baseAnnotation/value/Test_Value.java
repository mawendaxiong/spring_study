package com.example.spring_study.baseAnnotation.value;

import com.example.spring_study.baseAnnotation.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class Test_Value {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ValueTest.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(">>>>>>>>"+name);
        }
        Map<String, User> beansOfType = applicationContext.getBeansOfType(User.class);
        User user1 = beansOfType.get("user1");
        User user2 = beansOfType.get("user2");
        System.out.println(user1.getName());
        System.out.println(user1.getAddr());
        System.out.println(user2.getName());
        System.out.println(user2.getAddr());

    }
}

