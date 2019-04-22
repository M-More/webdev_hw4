package com.baowei.webhw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baowei.webhw4.vo.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,String> {

}
