package com.uscraft;

import com.uscraft.config.BasicMainConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

//@PropertySource("classpath:user.properties")
@Import(BasicMainConfiguration.class)
@SpringBootApplication (exclude = {TaskExecutionAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class InclusiveSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(InclusiveSpringApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args->{
			System.out.println("Let's inspect the beans provided by Spring Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			int count = 0;
			int count1 = 0;
			for (String beanName : beanNames) {
				if(beanName.endsWith("Configuration")){
					System.out.println(beanName);
					count++;
				}else{
					System.out.println(beanName);
					count1++;
				}
			}
			System.out.println("End with configuration count: " + count);
			System.out.println("End with other bean count: " + count1);
		};
	}

}
