package com.shopsphere.paymentservice.service;

import com.shopsphere.paymentservice.dto.PaymentRequest;
import com.shopsphere.paymentservice.entity.Payment;

import java.util.List;

public interface PaymentService {
    Payment processPayment(PaymentRequest paymentRequest);
    List<Payment> getAllPayments();
    Payment getPaymentById(Long id);
}
