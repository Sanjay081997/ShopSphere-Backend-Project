package com.shopsphere.productservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_service")
public class ProductserviceEntity {
    @Id
    private Long id;

    public ProductserviceEntity() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
