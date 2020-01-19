package com.uscraft.domain.enable;


import com.uscraft.domain.enable.register.HeroImportBeanDefinitionRegister;
import com.uscraft.domain.enable.register.HeroImportSelector;
import com.uscraft.domain.enable.register.IronLegionConfiguration;
import com.uscraft.domain.enable.pojo.IronMan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({IronMan.class, IronLegionConfiguration.class,
HeroImportSelector.class,HeroImportBeanDefinitionRegister.class})
public @interface EnableMarvelHero {
}
