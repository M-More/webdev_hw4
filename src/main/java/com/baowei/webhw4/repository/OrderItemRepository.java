package com.baowei.webhw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baowei.webhw4.vo.OrderItem;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem,String> {

    List<OrderItem> findOrderItemsByOrdernum(int orderNum);

}
