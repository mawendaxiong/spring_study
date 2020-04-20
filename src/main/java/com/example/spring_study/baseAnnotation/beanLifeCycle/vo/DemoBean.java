package com.example.spring_study.baseAnnotation.beanLifeCycle.vo;

public class DemoBean {

    public DemoBean(){
        System.out.println("constructor...");
    }

    public void init(){
        System.out.println("init...");
    }

    public void destory(){
        System.out.println("destory...");
    }


}
