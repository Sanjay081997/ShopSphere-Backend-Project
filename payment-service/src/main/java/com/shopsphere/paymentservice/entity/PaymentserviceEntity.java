package com.shopsphere.paymentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment_service")
public class PaymentserviceEntity {
    @Id
    private Long id;

    public PaymentserviceEntity() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
