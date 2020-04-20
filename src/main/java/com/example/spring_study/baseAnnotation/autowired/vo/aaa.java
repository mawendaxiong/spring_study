package com.example.spring_study.baseAnnotation.autowired.vo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("dao2")
@Primary
public class aaa implements AutoWiredDao {
}
