package com.example.Annotations.conditionalonproperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnProperty   //can use here as well
public class ConditionalConfig {

    @Value("${name}")
    private String name;

    @Bean
    @ConditionalOnProperty(name = "propertybean.enabled", havingValue = "true")  //will create bean only if true otherwise dont
    public Property testingbean(){

        System.out.println(name);
        return new Property();
    }


}
