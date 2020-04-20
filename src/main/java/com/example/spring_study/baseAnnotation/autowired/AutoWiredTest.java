package com.example.spring_study.baseAnnotation.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.example.spring_study.baseAnnotation.autowired.vo"})
public class AutoWiredTest {
    /**
     * 详细看 AutoWiredService
     */
}
