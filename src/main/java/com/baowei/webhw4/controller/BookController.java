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
        List<Book> booklist = bookService.findAllBook();
        return booklist;
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request, @RequestParam("bookIsbn") String bookIsbn) {
        bookService.deleteBook(bookIsbn);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request, @RequestParam("bookName") String bookName,
                      @RequestParam("bookAuthor") String bookAuthor, @RequestParam("bookIsbn") String bookIsbn,
                      @RequestParam("bookPrice") float bookPrice, @RequestParam("bookInventory") int bookInventory) {
        bookService.updateBook(bookName,bookAuthor,bookIsbn,bookPrice,bookInventory);
    }

    @RequestMapping("/create")
    public void create(HttpServletRequest request, @RequestParam("bookName") String bookName,
                      @RequestParam("bookAuthor") String bookAuthor, @RequestParam("bookIsbn") String bookIsbn,
                      @RequestParam("bookPrice") float bookPrice, @RequestParam("bookInventory") int bookInventory) {
        bookService.createBook(bookName,bookAuthor,bookIsbn,bookPrice,bookInventory);
    }

}
