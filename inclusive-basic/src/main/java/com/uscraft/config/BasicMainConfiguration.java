package com.uscraft.config;

import com.uscraft.domain.enable.EnableMarvelHero;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value = "com.uscraft.domain")
@EnableMarvelHero
public class BasicMainConfiguration {
}
