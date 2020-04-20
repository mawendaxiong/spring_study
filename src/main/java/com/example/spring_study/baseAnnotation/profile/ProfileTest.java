package com.example.spring_study.baseAnnotation.profile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.spring_study.profile.vo")
public class ProfileTest {

    /**
     * @Profile 可以作用在某个类上，当符合环境就会加进容器中
     *          可以作用在容器上，当符合环境就会将容器中bean都加载
     */

}
