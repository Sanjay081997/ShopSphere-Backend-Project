package com.shopsphere.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productservice")
public class ProductserviceController {

    @GetMapping("/hello")
    public String hello() {
        return "product-service is running";
    }
}
