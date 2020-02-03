package com.uscraft.account;


import com.uscraft.config.BasicMainConfiguration;
import com.uscraft.domain.spi.MessageServiceProvider;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ServiceLoader;
import java.util.stream.Stream;

public class BasicUnitTests extends BaseTest{


    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BasicMainConfiguration.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }


    /**
     * test service
     */
    @Test
    public void testServiceLoader(){
        ServiceLoader<MessageServiceProvider> serviceLoader = ServiceLoader.load(MessageServiceProvider.class);
        for (MessageServiceProvider service : serviceLoader) {
            service.sendMessage("hello");
        }

    }
}
