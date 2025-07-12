package com.shopsphere.orderservice.repository;

import com.shopsphere.orderservice.entity.OrderserviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderserviceRepository extends JpaRepository<OrderserviceEntity, Long> {}
