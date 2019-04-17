package com.baowei.webhw4.vo;

import java.io.Serializable;

import javax.persistence.*;

/*
 * 书籍实体类
 */


@Entity
@Table(name="book")
public class Book {

    @Column(name = "bookname")
    private String bookname;

    @Column(name = "author")
    private String author;

    @Id
    @Column(name = "isbn")
    private String isbn;

    @Column(name = "price")
    private float price;

    @Column(name = "inventory")
    private int inventory;

    public Book() {
        super();
    }

    public Book(String bookname, String author, String isbn, float price, int inventory) {
        super();
        this.bookname = bookname;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.inventory = inventory;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public float getPrice() {
        return price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
