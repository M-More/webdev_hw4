package com.baowei.webhw4.controller;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.baowei.webhw4.service.OrderService;
import com.baowei.webhw4.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/create")
    public void create() {
//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
//                .getAuthentication()
//                .getPrincipal();
//        String username = userDetails.getUsername();
//        Timestamp nowtime= Timestamp.valueOf(LocalDateTime.now());
//        orderService.createOrder(username,nowtime);
    }

    @RequestMapping("/findByUser")
    public List<Order> findByUser(HttpServletRequest request) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String username = userDetails.getUsername();
        List<Order> orderlist = orderService.findOrderByUsername(username);
        return orderlist;
    }

    @RequestMapping("/findRange")
    public List<Order> findRange(HttpServletRequest request, @RequestParam("startTime") long startTime,
                                 @RequestParam("endTime") long endTime){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String username = userDetails.getUsername();
        Timestamp start = new Timestamp(startTime);
        Timestamp end = new Timestamp(endTime);
        List<Order> orderList = orderService.findOrdersByTimeBetweenAndUsername(start, end, username);
        return orderList;
    }

}
