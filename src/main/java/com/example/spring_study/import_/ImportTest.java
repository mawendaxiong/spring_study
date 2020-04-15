package com.example.spring_study.import_;

import com.example.spring_study.import_.importPacket.Color;
import com.example.spring_study.import_.importPacket.Red;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Color.class, Red.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class ImportTest {
    /**
     * @Import 作用于类上
     * 有三种方式可以引入bean
     *      1：直接在import中直接添加类
     *      2：实现ImportSelector 详见MyImportSelector.class
     *      3：实现ImportBeanDefinitionRegistrar 手动注册bean，可以修改bean的各种信息 详见MyImportBeanDefinitionRegistrar.class
     */
}
