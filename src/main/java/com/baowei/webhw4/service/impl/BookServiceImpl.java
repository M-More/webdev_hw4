package com.baowei.webhw4.service.impl;

import java.util.List;

import com.baowei.webhw4.jdbcTemplate.MyRowMapper;
import com.baowei.webhw4.service.BookService;
import com.baowei.webhw4.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private  JdbcTemplate jdbcTemplate;

    /*
     * 查询所有书籍
     */

    @Override
    public List<Book> findAll(){
        String sql = "select * from book";
        List<Book> bookList = jdbcTemplate.query(sql,new MyRowMapper()) ;
        return bookList;
    }


    @Override
    public int delete(String bookIsbn) {
        String sql = "delete from book where isbn = ?";
        return jdbcTemplate.update(sql,bookIsbn);
    }

    @Override
    public int update(String bookName, String bookAuthor, String bookIsbn, float bookPrice, int bookInventory) {
        String sql = "update book set bookname = ? , author = ? , price = ? , inventory = ? where isbn = ?";
        return jdbcTemplate.update(sql,bookName,bookAuthor,bookPrice,bookInventory,bookIsbn);
    }

    @Override
    public int create(String bookName, String bookAuthor, String bookIsbn, float bookPrice, int bookInventory) {
        String sql = "insert into book values(?,?,?,?,?)";
        return jdbcTemplate.update(sql,bookName,bookAuthor,bookIsbn,bookPrice,bookInventory);
    }
}
