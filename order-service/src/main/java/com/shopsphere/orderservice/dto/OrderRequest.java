package com.shopsphere.orderservice.dto;

import java.time.LocalDateTime;

public class OrderRequest {
    private Long id;
    private String product;
    private int quantity;
    private double price;
    private LocalDateTime orderDate;

    // No-args constructor
    public OrderRequest() {
    }

    // Constructor with id and product (for your test)
    public OrderRequest(Long id, String product) {
        this.id = id;
        this.product = product;
    }

    // Full constructor
    public OrderRequest(Long id, String product, int quantity, double price, LocalDateTime orderDate) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.orderDate = orderDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
