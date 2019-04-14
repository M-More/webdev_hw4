package com.baowei.webhw4.vo;


/*
 * 书籍实体类:包含书籍的基本信息
 */

public class Book {

    private String bookname;
    private String author;
    private String isbn;
    private float price;
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
