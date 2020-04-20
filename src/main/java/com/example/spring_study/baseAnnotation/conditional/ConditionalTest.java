package com.example.spring_study.baseAnnotation.conditional;

import com.example.spring_study.baseAnnotation.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalTest {

    /**
     * @Conditional 可作用于方法或者类上
     * 可以使用自定义的condition类来定义加载bean
     * 详细看WindowsCondition.class
     */

    @Bean("BILL")
    @Conditional(WindowsCondition.class)
    public User user1(){
        System.out.println("bill 被加载了");
        return new User("bill", 55);
    }

    @Bean("LINUS")
    @Conditional(LinuxCondition.class)
    public User user2(){
        System.out.println("linus 被加载了");
        return new User("linus", 48);
    }
}
