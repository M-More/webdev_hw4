package com.baowei.webhw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baowei.webhw4.entity.Cart;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,String> {

    List<Cart> findAllByUsername(String username);

    void deleteAllByUsername(String username);

    void deleteCartByUsernameAndIsbn(String username, String isbn);

}
