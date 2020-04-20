package com.example.spring_study.baseAnnotation.componentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * excludeFilters 排除哪些bean excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {xxx.class, xxx.class})}
 * includeFilters 包含哪些bean includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {xxx.class, xxx.class})}
 * includeFilters需要将 useDefaultFilters 设为 false
 * FilterType.ANNOTATION 注解类型
 * FilterType.ASSIGNABLE_TYPE 自定义类型 @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {OtherDao.class, DefaultDao.class})
 * FilterType.ASPECTJ,
 * FilterType.REGEX,
 * FilterType.CUSTOM; 自定义过滤类  详细看MyTypeFilter
 */
@Configuration
@ComponentScan(value = {"com.example.spring_study.baseAnnotation.componentScan.testBean",
        "com.example.spring_study.baseAnnotation.componentScan.testBean"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})}
        /*includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})},useDefaultFilters = false*/)
public class ComponentScanTest {

}
