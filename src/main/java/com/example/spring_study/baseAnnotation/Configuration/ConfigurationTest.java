package com.example.spring_study.baseAnnotation.Configuration;

import com.example.spring_study.baseAnnotation.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationTest {

    /**
     * 如果没有在@Bean这个注解上定义bean的名字，
     * 则bean的名字是方法的名字。
     */
    @Bean
    public User userBean01(){
        return new User("jack",23);
    }

    @Bean(name = "myBean")
    public User userBean02(){
        return new User("jack",23);
    }
}
