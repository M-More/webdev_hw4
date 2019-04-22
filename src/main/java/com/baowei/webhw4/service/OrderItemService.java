package com.baowei.webhw4.service;

import java.sql.Timestamp;
import java.util.List;
import com.baowei.webhw4.vo.OrderItem;

public interface OrderItemService {

    void createOrderItem(int orderNum, String itemName, String itemIsbn, int itemAmount);

}
