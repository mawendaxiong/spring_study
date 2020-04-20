package com.example.spring_study.baseAnnotation.lazyBean;

import com.example.spring_study.baseAnnotation.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class LazyBeanTest {
    /**
     * @Lazy 可以让单实例的bean不在容器创建的就创建，
     * 而是在使用的时候再创建
     * @return
     */
    @Lazy
    @Bean("user1")
    public User user1(){
        System.out.println("初始化user");
        return new User("polo", 8);
    }
}
