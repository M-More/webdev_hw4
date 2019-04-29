package com.baowei.webhw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baowei.webhw4.entity.Order;

import java.sql.Timestamp;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    Order findFirstByOrderByNumDesc();

    List<Order> findOrdersByUsername(String username);

    List<Order> findOrdersByTimeBetweenAndUsername(Timestamp start, Timestamp end, String username);
}
