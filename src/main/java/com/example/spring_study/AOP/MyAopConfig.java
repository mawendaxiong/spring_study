package com.example.spring_study.AOP;

import org.aspectj.lang.annotation.*;

@Aspect
public class MyAopConfig {

    @Pointcut(value = "execution(* com.example.spring_study.AOP..*.*(..))")
    public void pointcut(){
    }

    @Before("pointcut()")
    public void beforeMethod(){
        System.out.println("before....");
    }

    @After("pointcut()")
    public void afterMethod(){
        System.out.println("after...");
    }

    @AfterReturning("pointcut()")
    public void methodReturn(){
        System.out.println("return...");
    }

    @AfterThrowing("pointcut()")
    public void methodExecption(){
        System.out.println("execption...");
    }
}
