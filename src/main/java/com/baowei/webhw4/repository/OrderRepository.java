package com.baowei.webhw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baowei.webhw4.vo.Order;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    Order findFirstByOrderByNumDesc();

    List<Order> findOrdersByUsername(String username);
}
