package com.shopsphere.orderservice.service;

import com.shopsphere.orderservice.dto.OrderRequest;
import com.shopsphere.orderservice.entity.Order;

import java.util.List;

public interface OrderService {
	Order createOrder(OrderRequest orderRequest);
	Order getOrderById(Long id);
    List<Order> getAllOrders();
    void deleteOrder(Long id);
}
