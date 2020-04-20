package com.example.spring_study.baseAnnotation.profile.vo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("prod")
public class SourceC {
}
