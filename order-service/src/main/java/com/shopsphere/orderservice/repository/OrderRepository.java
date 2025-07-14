package com.shopsphere.orderservice.repository;

import com.shopsphere.orderservice.entity.OrderserviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderserviceEntity, Long> {
}
