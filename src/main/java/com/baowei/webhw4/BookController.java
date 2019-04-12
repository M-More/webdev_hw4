package com.baowei.webhw4;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baowei.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private  BookService bookService;

    @RequestMapping("/showAll")
    public List<Book> showAll() {
        List<Book> booklist = bookService.findAll();
        return booklist;
    }
}
