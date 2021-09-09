package com.samay.tech.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samay.tech.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
