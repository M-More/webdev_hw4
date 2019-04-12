package com.baowei.webhw4;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.baowei.webhw4.Book;

public class MyRowMapper implements RowMapper<Book>{
    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {

        String bookName = resultSet.getString("bookname");
        String bookAuthor = resultSet.getString("author");
        String bookIsbn = resultSet.getString("isbn");
        float bookPrice = resultSet.getFloat("price");
        int bookInventory = resultSet.getInt("inventory");


        Book book = new Book();
        book.setBookname(bookName);
        book.setAuthor(bookAuthor);
        book.setIsbn(bookIsbn);
        book.setPrice(bookPrice);
        book.setInventory(bookInventory);

        return book;
    }
}
