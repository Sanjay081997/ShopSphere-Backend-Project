package com.shopsphere.orderservice.service.impl;

import com.shopsphere.orderservice.dto.OrderRequest;
import com.shopsphere.orderservice.entity.Order;
import com.shopsphere.orderservice.repository.OrderRepository;
import com.shopsphere.orderservice.service.OrderService;
import com.shopsphere.orderservice.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(OrderRequest request) {
    	Order order = new Order();
        order.setProduct(request.getProduct());
        order.setQuantity(request.getQuantity());
        order.setPrice(request.getPrice());
        order.setOrderDate(request.getOrderDate());
        return orderRepository.save(order);
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with ID: " + id));
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteOrder(Long id) {
    	Order order = getOrderById(id);
        orderRepository.delete(order);
    }
}
