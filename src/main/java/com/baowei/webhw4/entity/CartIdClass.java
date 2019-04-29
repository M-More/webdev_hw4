package com.baowei.webhw4.entity;

import java.io.Serializable;

public class CartIdClass implements Serializable {
    private String username;
    private String isbn;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
