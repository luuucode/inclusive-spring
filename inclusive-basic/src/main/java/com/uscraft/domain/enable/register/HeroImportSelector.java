package com.uscraft.domain.enable.register;

import com.uscraft.domain.enable.pojo.Pepper;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


public class HeroImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Pepper.class.getName()};
    }
}
