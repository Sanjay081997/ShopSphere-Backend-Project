package com.shopsphere.paymentservice.entity;

import java.util.List;

public class Payment {
    private Long paymentId;
    private String orderId;
    private String paymentMethod;
    private String status;

    // List of PaymentItems linked to this payment
    private List<PaymentItem> paymentItems;

    // No-args constructor
    public Payment() {
    }

    // All-args constructor
    public Payment(Long paymentId, String orderId, String paymentMethod, String status, List<PaymentItem> paymentItems) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.paymentItems = paymentItems;
    }

    // Getters and setters

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PaymentItem> getPaymentItems() {
        return paymentItems;
    }

    public void setPaymentItems(List<PaymentItem> paymentItems) {
        this.paymentItems = paymentItems;
    }
}
