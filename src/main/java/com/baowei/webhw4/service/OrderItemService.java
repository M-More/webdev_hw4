package com.baowei.webhw4.service;

import java.util.List;
import com.baowei.webhw4.entity.OrderItem;

public interface OrderItemService {

    void createOrderItem(int orderNum, String itemName, String itemIsbn, int itemAmount);

    List<OrderItem> findOrderItemsByOrdernum(int orderNum);

}
