package com.shopsphere.paymentservice.service.impl;

import com.shopsphere.paymentservice.dto.PaymentRequest;
import com.shopsphere.paymentservice.entity.Payment;
import com.shopsphere.paymentservice.repository.PaymentRepository;
import com.shopsphere.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment processPayment(PaymentRequest request) {
        Payment payment = new Payment();   // no builder, just new object
        payment.setOrderId(request.getOrderId());
        payment.setPaymentMethod(request.getPaymentMethod());
        payment.setStatus("SUCCESS");
        // set other fields as needed

        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }
}
