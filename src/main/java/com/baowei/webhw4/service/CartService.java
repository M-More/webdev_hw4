package com.baowei.webhw4.service;

import java.util.List;
import com.baowei.webhw4.entity.Cart;

public interface CartService {
    List<Cart> findCartbyUsername(String userName);

    void createCart(String userName, String cartName, String cartIsbn, int cartInventory, int cartAmount);

    void updateCart(String userName, String cartName, String cartIsbn, int cartInventory, int cartAmount);

    void deleteCart(String userName, String isbn);

    void clearCart(String userName);
}
