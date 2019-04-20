package com.baowei.webhw4.vo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="cart")
@IdClass(com.baowei.webhw4.vo.CartIdClass.class)
public class Cart {

    @Id
    @Column(name = "cartbook_user")
    private String username;

    @Column(name = "cartbook_bookname")
    private String bookname;

    @Id
    @Column(name = "cartbook_isbn")
    private String isbn;

    @Column(name = "cartbook_amount")
    private int amount;

    public Cart(){
        super();
    }

    public Cart(String username, String bookname, String isbn, int amount) {
        super();
        this.username = username;
        this.bookname = bookname;
        this.isbn = isbn;
        this.amount = amount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}


