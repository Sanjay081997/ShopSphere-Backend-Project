package com.shopsphere.paymentservice.controller;

import com.shopsphere.paymentservice.dto.PaymentRequest;
import com.shopsphere.paymentservice.entity.Payment;
import com.shopsphere.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Payment processPayment(@RequestBody PaymentRequest request) {
        return paymentService.processPayment(request);
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }
}
