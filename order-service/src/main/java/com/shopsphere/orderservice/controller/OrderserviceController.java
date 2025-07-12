package com.shopsphere.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orderservice")
public class OrderserviceController {

    @GetMapping("/hello")
    public String hello() {
        return "order-service is running";
    }
}
