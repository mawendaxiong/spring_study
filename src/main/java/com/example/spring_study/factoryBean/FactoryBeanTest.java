package com.example.spring_study.factoryBean;

import com.example.spring_study.import_.importPacket.Color;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanTest  {

    /**
     * 注册时factorybean，但实际拿到的是color对象
     * @return
     */
    @Bean
    public MyBeanFactory beanFactory(){
        return new MyBeanFactory();
    }
}
