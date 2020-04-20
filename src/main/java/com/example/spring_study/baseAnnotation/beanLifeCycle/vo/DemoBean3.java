package com.example.spring_study.baseAnnotation.beanLifeCycle.vo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DemoBean3 {
    public DemoBean3() {
        System.out.println("DemoBean3 constructor...");
    }

    @PostConstruct
    public void init(){
        System.out.println("DemoBean3 init...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("DemoBean3 destory...");
    }
}
