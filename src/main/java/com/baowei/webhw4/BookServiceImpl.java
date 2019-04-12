package com.baowei.webhw4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.baowei.*;

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
}
