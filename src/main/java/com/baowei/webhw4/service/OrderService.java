package com.baowei.webhw4.service;

import java.sql.Timestamp;
import java.util.List;
import com.baowei.webhw4.vo.Order;

public interface OrderService {

    Order getMaxNum();

    void createOrder(String orderUser, Timestamp orderTime);

}
