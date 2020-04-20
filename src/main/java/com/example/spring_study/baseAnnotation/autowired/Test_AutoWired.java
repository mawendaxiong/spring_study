package com.example.spring_study.baseAnnotation.autowired;

import com.example.spring_study.baseAnnotation.autowired.vo.AutoWiredDao;
import com.example.spring_study.baseAnnotation.autowired.vo.AutoWiredService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class Test_AutoWired {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoWiredTest.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Map<String, AutoWiredDao> beansOfType = applicationContext.getBeansOfType(AutoWiredDao.class);
        System.out.println(beansOfType);
        AutoWiredService service = applicationContext.getBean(AutoWiredService.class);
        service.foo();
        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
    }
}
