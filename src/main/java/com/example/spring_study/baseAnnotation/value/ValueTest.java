package com.example.spring_study.baseAnnotation.value;

import com.example.spring_study.baseAnnotation.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 1.@PropertySource 带上classpath要注意只能单斜杠（/）
 * 2.@PropertySource 可以不写classpath，springboot应该默认找的resources文件夹(个人猜想）
 */
@PropertySource(value = {"my.properties","my2.properties"})
@Configuration
public class ValueTest {
    /**
     * @Value 不带任何符号，赋什么值就输出什么 例子:@Value("user.name") 输出user.name
     * @Value 用${}包含起来的内容，会去指定的配置文件查找对应字段的值。如果存在两份配置文件，以最后一份配置文件的值为准
     *          如果
     * @Value 用#{}包含起来，里面可写el表达式
     */

    /**
     * 记user.name的坑
     * 在springboot默认的配置中有这么一项的配置
     * 记录着该电脑当前登陆用户的名字
     * 还有很多默认的配置，定义名字的时候要注意重名
     */
    @Value("${user.name}")
    private String name;

    @Bean("user1")
    public User user(){
        System.out.println("****"+name);
        return new User("hello",5);
    }

    @Bean("user2")
    public User user1(){
        System.out.println("****"+name);
        return new User("jack",65);
    }
}
