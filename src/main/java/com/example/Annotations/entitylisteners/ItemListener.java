package com.example.Annotations.entitylisteners;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PrePersist;

public class ItemListener {

    //will listen every updates for entity class

    @PrePersist
    public void savedCallback(Object object){
        System.out.println("before saved details of entity!!!");
    }

    @PostPersist
    public void savedCallback1(Object object){
        System.out.println("saved details of entity!!!");
    }



}
