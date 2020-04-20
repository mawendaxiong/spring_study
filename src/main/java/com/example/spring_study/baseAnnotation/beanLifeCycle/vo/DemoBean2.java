package com.example.spring_study.baseAnnotation.beanLifeCycle.vo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

public class DemoBean2 implements InitializingBean, DisposableBean {
    public DemoBean2(){
        System.out.println("DemoBean2 constructor...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DemoBean2 intit...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DemoBean2 destory...");
    }
}
