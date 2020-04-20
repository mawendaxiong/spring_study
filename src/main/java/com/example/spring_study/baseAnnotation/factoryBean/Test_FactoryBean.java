package com.example.spring_study.baseAnnotation.factoryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_FactoryBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanTest.class);

        //这个是获取到color对象
        Class<?> aClass = applicationContext.getBean("beanFactory").getClass();
        System.out.println(aClass);

        //这个是获取到MyBeanFactory对象 重点：&符号
        Class<?> bClass = applicationContext.getBean("&beanFactory").getClass();
        System.out.println(bClass);

        Object bean1 = applicationContext.getBean("beanFactory");
        Object bean2 = applicationContext.getBean("beanFactory");
        System.out.println(bean1==bean2);

    }
}
