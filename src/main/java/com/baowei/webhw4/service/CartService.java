package com.baowei.webhw4.service;

import java.util.List;
import com.baowei.webhw4.vo.Cart;

public interface CartService {
    List<Cart> findCartbyUsername(String userName);

    void createCart(String userName, String cartName, String cartIsbn, int cartAmount);

    void updateCart(String userName, String cartName, String cartIsbn, int cartAmount);

    void deleteCart(String userName, String isbn);
}
