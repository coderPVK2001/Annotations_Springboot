package com.example.Annotations.qualifierservice;

import org.springframework.stereotype.Service;

@Service(value = "credit")
public class PaymentServiceImpl1 implements PaymentService{

    @Override
    public void processPayment() {
        System.out.println("credit card payment service implemented!!");
    }

}
