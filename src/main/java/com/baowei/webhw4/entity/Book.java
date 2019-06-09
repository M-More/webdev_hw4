package com.baowei.webhw4.entity;

import org.springframework.data.annotation.Id;

/*
 * 书籍实体类
 */

public class Book {

    private String bookname;

    private String author;

    @Id
    private String isbn;

    private String press;

    private String size;

    private String pubtime;

    private String intro;

    private int inventory;

    private String cover;

    public Book() {
        super();
    }

    public Book(String bookname, String author, String isbn, String press, String size, String pubtime, String intro, int inventory, String cover) {
        super();
        this.bookname = bookname;
        this.author = author;
        this.isbn = isbn;
        this.press = press;
        this.size = size;
        this.pubtime = pubtime;
        this.intro = intro;
        this.inventory = inventory;
        this.cover = cover;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getCover() { return cover; }

    public void setCover(String cover) { this.cover = cover; }
}
