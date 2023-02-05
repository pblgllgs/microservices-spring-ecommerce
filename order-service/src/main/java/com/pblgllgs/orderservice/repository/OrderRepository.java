package com.pblgllgs.orderservice.repository;

import com.pblgllgs.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
