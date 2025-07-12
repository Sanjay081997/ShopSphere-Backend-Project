package com.shopsphere.orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_service")
public class OrderserviceEntity {
    @Id
    private Long id;

    public OrderserviceEntity() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
