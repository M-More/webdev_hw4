package com.baowei.webhw4.controller;

import java.util.List;

import com.baowei.webhw4.service.BookService;
import com.baowei.webhw4.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/showAll")
    public List<Book> showAll() {
        List<Book> booklist = bookService.findAll();
        return booklist;
    }

    @RequestMapping("/delete")
    public int delete(HttpServletRequest request, @RequestParam("bookIsbn") String bookIsbn) {
        int result = bookService.delete(bookIsbn);
        return result;
    }

    @RequestMapping("/update")
    public int update(HttpServletRequest request, @RequestParam("bookName") String bookName,
                      @RequestParam("bookAuthor") String bookAuthor, @RequestParam("bookIsbn") String bookIsbn,
                      @RequestParam("bookPrice") float bookPrice, @RequestParam("bookInventory") int bookInventory) {
        int result = bookService.update(bookName,bookAuthor,bookIsbn,bookPrice,bookInventory);
        return result;
    }

    @RequestMapping("/create")
    public int create(HttpServletRequest request, @RequestParam("bookName") String bookName,
                      @RequestParam("bookAuthor") String bookAuthor, @RequestParam("bookIsbn") String bookIsbn,
                      @RequestParam("bookPrice") float bookPrice, @RequestParam("bookInventory") int bookInventory) {
        int result = bookService.create(bookName,bookAuthor,bookIsbn,bookPrice,bookInventory);
        return result;
    }

}
