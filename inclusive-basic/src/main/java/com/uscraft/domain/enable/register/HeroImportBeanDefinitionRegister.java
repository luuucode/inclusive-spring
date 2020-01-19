package com.uscraft.domain.enable.register;

import com.uscraft.domain.enable.pojo.Jarvis;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class HeroImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("pepper", BeanDefinitionBuilder.genericBeanDefinition(Jarvis.class)
                .getBeanDefinition());

    }
}
