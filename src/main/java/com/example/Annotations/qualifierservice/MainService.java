package com.example.Annotations.qualifierservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    @Qualifier("credit")
    PaymentService paymentService;

   public void test(){
       paymentService.processPayment();
   }


}
