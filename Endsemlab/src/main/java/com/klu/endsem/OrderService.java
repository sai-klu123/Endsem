package com.klu.endsem;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final Repo orderRepository;

    public OrderService(Repo orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }
}
