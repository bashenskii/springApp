package com.bashenskyi.springApp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Ruslan on 30.04.2017.
 */
@Configuration
public class SpringConfiguration {

    @Bean
    @Scope(scopeName = "prototype")
    HelloWorld helloWorld(){
        return new HelloWorld();
    }


}
