package com.baowei.webhw4.controller;

import java.util.List;

import com.baowei.webhw4.service.CartService;
import com.baowei.webhw4.vo.Cart;

import com.baowei.webhw4.vo.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @RequestMapping("/showAll")
    public List<Cart> showAll(HttpServletRequest request) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String username = userDetails.getUsername();
        List<Cart> cartlist = cartService.findCartbyUsername(username);
        return cartlist;
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request, @RequestParam("isbn") String isbn) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String username = userDetails.getUsername();
        cartService.deleteCart(username,isbn);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request,
                       @RequestParam("cartName") String cartName, @RequestParam("cartIsbn") String cartIsbn,
                       @RequestParam("cartAmount") int cartAmount) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String username = userDetails.getUsername();
        cartService.updateCart(username,cartName,cartIsbn,cartAmount);
    }

    @RequestMapping("/create")
    public void create(HttpServletRequest request,
                       @RequestParam("cartName") String cartName, @RequestParam("cartIsbn") String cartIsbn,
                       @RequestParam("cartAmount") int cartAmount) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String username = userDetails.getUsername();
        cartService.createCart(username,cartName,cartIsbn,cartAmount);
    }

}
