package com.example.spring_study.baseAnnotation.import_;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"com.example.spring_study.baseAnnotation.import_.importPacket.Blue",
                "com.example.spring_study.baseAnnotation.import_.importPacket.Yellow"};
    }
}
