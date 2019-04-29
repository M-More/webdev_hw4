package com.baowei.webhw4.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baowei.webhw4.entity.Cart;
import com.baowei.webhw4.repository.CartRepository;
import com.baowei.webhw4.service.CartService;

@Service
@Transactional
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Cart> findCartbyUsername(String userName){
        return cartRepository.findAllByUsername(userName);
    }

    @Override
    public void createCart(String userName, String cartName, String cartIsbn, int cartInventory, int cartAmount){
        Cart cartbook = new Cart(userName,cartName,cartIsbn,cartInventory,cartAmount);
        cartRepository.save(cartbook);
    }

    @Override
    public void updateCart(String userName, String cartName, String cartIsbn, int cartInventory, int cartAmount){
        Cart cartbook = new Cart(userName,cartName,cartIsbn,cartInventory,cartAmount);
        cartRepository.save(cartbook);
    }

    @Override
    public void deleteCart(String userName, String isbn) {
        cartRepository.deleteCartByUsernameAndIsbn(userName, isbn);
    }

    @Override
    public void clearCart(String userName) {
        cartRepository.deleteAllByUsername(userName);
    }
}
