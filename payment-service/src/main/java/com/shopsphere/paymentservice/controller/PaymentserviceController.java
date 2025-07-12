package com.shopsphere.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paymentservice")
public class PaymentserviceController {

    @GetMapping("/hello")
    public String hello() {
        return "payment-service is running";
    }
}
