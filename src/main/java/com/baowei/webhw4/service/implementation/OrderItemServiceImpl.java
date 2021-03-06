package com.baowei.webhw4.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baowei.webhw4.entity.OrderItem;
import com.baowei.webhw4.repository.OrderItemRepository;
import com.baowei.webhw4.service.OrderItemService;

@Service
@Transactional
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void createOrderItem(int orderNum, String itemName, String itemIsbn, int itemAmount) {
        OrderItem orderitem = new OrderItem(orderNum,itemName,itemIsbn,itemAmount);
        orderItemRepository.save(orderitem);
    }

    @Override
    public List<OrderItem> findOrderItemsByOrdernum(int orderNum){
        List<OrderItem> itemList = orderItemRepository.findOrderItemsByOrdernum(orderNum);
        return itemList;
    }
}
