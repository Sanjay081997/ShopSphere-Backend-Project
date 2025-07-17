package com.shopsphere.paymentservice.entity;

public class PaymentItem {
    private Long paymentItemId;
    private Long paymentId;  // foreign key reference to Payment
    private String itemName;
    private double amount;

    // No-args constructor
    public PaymentItem() {
    }

    // All-args constructor
    public PaymentItem(Long paymentItemId, Long paymentId, String itemName, double amount) {
        this.paymentItemId = paymentItemId;
        this.paymentId = paymentId;
        this.itemName = itemName;
        this.amount = amount;
    }

    // Getters and setters

    public Long getPaymentItemId() {
        return paymentItemId;
    }

    public void setPaymentItemId(Long paymentItemId) {
        this.paymentItemId = paymentItemId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
