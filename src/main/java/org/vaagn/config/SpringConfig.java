package org.vaagn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.vaagn.service.TestBean;

@Configuration

public class SpringConfig {

    @Bean
    public TestBean getTestBean(){

        return new TestBean("hello");
    }
}
