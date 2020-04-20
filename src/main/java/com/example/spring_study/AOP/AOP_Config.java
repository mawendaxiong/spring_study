package com.example.spring_study.AOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AOP_Config {

    @Bean
    public SimpleMethod simpleMethod(){
        return new SimpleMethod();
    }
}
