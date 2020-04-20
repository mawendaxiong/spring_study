package com.example.spring_study.baseAnnotation.componentScan;

import org.springframework.core.type.MethodMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Set;

public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
//      获取文件资源
        String name = metadataReader.getResource().getFile().getName();
        if (name.contains("Controller")){
            return true;
        }

//        获取所有的注解
//        Set<String> service = metadataReader.getAnnotationMetadata().getAnnotationTypes();
//        for (String methodMetadata:service){
//            if (methodMetadata.contains("Repository")){
//                return true;
//            }
//        }

//        获取所有class的名字
//        String className = metadataReader.getClassMetadata().getClassName();
//        if (className.contains("Other")){
//            return true;
//        }
        return false;
    }
}
