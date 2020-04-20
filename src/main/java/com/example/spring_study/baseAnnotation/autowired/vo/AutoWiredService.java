package com.example.spring_study.baseAnnotation.autowired.vo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 记一个 interface的坑
 * 不能直接在接口上使用@Repository注解
 * 需要在实现类中使用
 */
@Service("autoWiredService")
public class AutoWiredService {
    /**
     * 1.@Autowired 自动装配bean需要的组件，从spring容器中查找
     * 2.@Autowired 的required属性，用于标识该注入为null时是否可以跳过
     * 3.若存在两个相同类型的bean 本例中的aaa 和 bbb ，
     *      则需要用@Qualifier 来根据bean的名字进行引入
     *                  或者
     *      使用@Primary 加在相同类型的某一个类中，告诉spring优先使用哪一个
     *
     * 4.@Resouce java中的自动装配注解，根据名称来匹配，可以使用name属性来修改默认的名字
     *              @Resouce 也可以搭配@Qualifier 和 @Primary 来使用，效果一样
     */
//    @Autowired(required = false)
    @Resource
    @Qualifier("dao1")
    private AutoWiredDao autoWiredDao;

    public void foo(){
        System.out.println("///////"+autoWiredDao);
    }
}
