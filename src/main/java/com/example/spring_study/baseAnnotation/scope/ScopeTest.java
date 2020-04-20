package com.example.spring_study.baseAnnotation.scope;

import com.example.spring_study.baseAnnotation.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeTest {

    /**
     * 单实例情况下，spring容器启动的时候就会创建对象创建bean
     * 多实例情况下，spring容器启动不会创建实例创建bean，
     * 只有在需要这个bean的时候创建对象创建bean
     */

    /**
     * spring容器中的bean默认单实例
     */
    @Bean("user01")
    public User user01(){
        return new User("jack", 30);
    }

    /**
     * 需要多实例将scope赋值prototype
     * @return
     */
    @Scope(value = "prototype")
    @Bean("user02")
    public User user02(){
        return new User("xiaohu", 55);
    }
}
