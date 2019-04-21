package com.baowei.webhw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baowei.webhw4.vo.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
