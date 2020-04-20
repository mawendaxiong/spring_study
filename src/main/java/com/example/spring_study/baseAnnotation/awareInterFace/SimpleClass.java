package com.example.spring_study.baseAnnotation.awareInterFace;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * 可以运用spring底层的一系列功能
 * 源码大概解读：
 *      每一种aware，都有对应的一种的xxxProcessor
 *      在postProcessBeforeInitialization这个方法中调用invokeAwareInterfaces
 *      根据一系列的类型判断
 *      然后set进去
 *      ######################################################################################
 *      #if (bean instanceof ApplicationContextAware) {                                      #
 * 		#	((ApplicationContextAware) bean).setApplicationContext(this.applicationContext); #
 *      #}                                                                                   #
 *      ######################################################################################
 *
 */
@Component
public class SimpleClass implements BeanNameAware,ApplicationContextAware, EmbeddedValueResolverAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("------------"+applicationContext.getId());
        this.applicationContext = applicationContext;
    }


    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String word = resolver.resolveStringValue("hello !${os.name}");
        System.out.println(word);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
