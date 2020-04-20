package com.example.spring_study.baseAnnotation.import_;

import com.example.spring_study.baseAnnotation.import_.importPacket.Red;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("com.example.spring_study.baseAnnotation.import_.importPacket.Red");
        boolean blue = registry.containsBeanDefinition("com.example.spring_study.baseAnnotation.import_.importPacket.Blue");
        if (red&&blue){
            registry.registerBeanDefinition("RED1", new RootBeanDefinition(Red.class));
        }
    }
}
