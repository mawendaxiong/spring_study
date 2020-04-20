package com.example.spring_study.baseAnnotation.factoryBean;

import com.example.spring_study.baseAnnotation.import_.importPacket.Color;
import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactory implements FactoryBean<Color> {
    /**
     * 获取实例
     */
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    /**
     * 获取类型
     */
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /**
     * 是否单例
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
