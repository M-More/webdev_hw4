package com.baowei.webhw4.service;

import java.sql.Timestamp;
import java.util.List;
import com.baowei.webhw4.entity.Order;

public interface OrderService {
    List<Order> findAllOrder();

    Order getMaxNum();

    void createOrder(String orderUser, Timestamp orderTime);

    List<Order> findOrderByUsername(String orderUser);

    List<Order> findOrdersByTimeBetweenAndUsername(Timestamp start, Timestamp end, String username);
}
