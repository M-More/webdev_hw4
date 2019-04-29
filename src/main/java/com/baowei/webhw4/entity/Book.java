package com.baowei.webhw4.entity;

import javax.persistence.*;

/*
 * 书籍实体类
 */


@Entity
@Table(name="book")
public class Book {

    @Column(name = "book_name")
    private String bookname;

    @Column(name = "book_author")
    private String author;

    @Id
    @Column(name = "book_isbn")
    private String isbn;

    @Column(name = "book_press")
    private String press;

    @Column(name = "book_size")
    private String size;

    @Column(name = "book_pubtime")
    private String pubtime;

    @Column(name = "book_intro")
    private String intro;

    @Column(name = "book_inventory")
    private int inventory;

    public Book() {
        super();
    }

    public Book(String bookname, String author, String isbn, String press, String size, String pubtime, String intro, int inventory) {
        super();
        this.bookname = bookname;
        this.author = author;
        this.isbn = isbn;
        this.press = press;
        this.size = size;
        this.pubtime = pubtime;
        this.intro = intro;
        this.inventory = inventory;
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
}
