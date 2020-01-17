package com.uscraft.account;


import com.uscraft.account.config.AccountMainConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Configuration
@Import({AccountMainConfiguration.class})
@MapperScan(value = {"com.uscraft.account.mapper"})
@PropertySource({"classpath:application.yml"})
public class BaseTestConfiguration {


}
