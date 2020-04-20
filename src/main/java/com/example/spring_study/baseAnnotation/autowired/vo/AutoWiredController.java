package com.example.spring_study.baseAnnotation.autowired.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AutoWiredController {
    @Autowired
    private AutoWiredService autoWiredService;
}
