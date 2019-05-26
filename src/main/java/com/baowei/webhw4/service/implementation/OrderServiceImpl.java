package com.baowei.webhw4.service.implementation;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baowei.webhw4.entity.Order;
import com.baowei.webhw4.repository.OrderRepository;
import com.baowei.webhw4.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getMaxNum() {
        return orderRepository.findFirstByOrderByNumDesc();
    }

    @Override
    public void createOrder(String orderUser, Timestamp orderTime) {
        Order order = new Order(orderUser,orderTime);
        orderRepository.save(order);
    }

    @Override
    public List<Order> findAllOrder(){
        List<Order> orderList = orderRepository.findAll();
        return orderList;
    }

    @Override
    public List<Order> findOrderByUsername(String orderUser){
        List<Order> orderList = orderRepository.findOrdersByUsername(orderUser);
        return orderList;
    }

    @Override
    public List<Order> findOrdersByTimeBetweenAndUsername(Timestamp start, Timestamp end, String username){
        List<Order> orderList = orderRepository.findOrdersByTimeBetweenAndUsername(start, end, username);
        return orderList;
    }
}
