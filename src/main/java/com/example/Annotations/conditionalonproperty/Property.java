package com.example.Annotations.conditionalonproperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
public class Property {

//    public Property() {
//        System.out.println("hello bean created");
//    }

    public void testingproperty(){
        System.out.println("property is being tested sucessfully!!");
    }
}
