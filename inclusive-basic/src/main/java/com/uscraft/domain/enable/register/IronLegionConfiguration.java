package com.uscraft.domain.enable.register;

import com.uscraft.domain.enable.pojo.MarkVIIIArmors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IronLegionConfiguration {

    @Bean
    public MarkVIIIArmors callMarkVIIIArmors(){
        return new MarkVIIIArmors();
    }

}
