package com.uscraft.account;


import com.uscraft.config.BasicMainConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Configuration
@Import(BasicMainConfiguration.class)
public class BaseTestConfiguration {


}
