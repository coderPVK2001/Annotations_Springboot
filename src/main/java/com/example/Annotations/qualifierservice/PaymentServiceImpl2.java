package com.example.Annotations.qualifierservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(value="debit")
public class PaymentServiceImpl2 implements PaymentService{

    @Override
    public void processPayment() {
        System.out.println("debit card payment service implemented!!");
    }
}
