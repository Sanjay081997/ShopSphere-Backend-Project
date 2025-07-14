package com.shopsphere.orderservice.service;

import com.shopsphere.orderservice.entity.OrderserviceEntity;
import com.shopsphere.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderserviceEntity createOrder(OrderserviceEntity order) {
        return orderRepository.save(order);
    }

    public List<OrderserviceEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<OrderserviceEntity> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public OrderserviceEntity updateOrder(Long id, OrderserviceEntity updatedOrder) {
        return orderRepository.findById(id)
                .map(order -> {
                    order.setProduct(updatedOrder.getProduct());
                    order.setQuantity(updatedOrder.getQuantity());
                    order.setPrice(updatedOrder.getPrice());
                    order.setOrderDate(updatedOrder.getOrderDate());
                    return orderRepository.save(order);
                }).orElseThrow(() -> new RuntimeException("Order not found with id " + id));
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
