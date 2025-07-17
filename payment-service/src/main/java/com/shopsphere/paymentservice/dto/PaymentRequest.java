package com.shopsphere.paymentservice.dto;

public class PaymentRequest {
    private String orderId;
    private String paymentMethod;

    // No-args constructor
    public PaymentRequest() {
    }

    // All-args constructor
    public PaymentRequest(String orderId, String paymentMethod) {
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
