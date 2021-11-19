package com.example.qulinarium.services;

import com.example.qulinarium.model.Order;
import com.example.qulinarium.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {this.orderRepository = orderRepository;}

    public List<Order> findOrders(Long userId){
        return orderRepository.findOrders(userId);
    }
}
