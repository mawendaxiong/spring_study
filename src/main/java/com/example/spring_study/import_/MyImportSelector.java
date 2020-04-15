package com.example.spring_study.import_;

import com.example.spring_study.import_.importPacket.Blue;
import com.example.spring_study.import_.importPacket.Yellow;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"com.example.spring_study.import_.importPacket.Blue","com.example.spring_study.import_.importPacket.Yellow"};
    }
}
