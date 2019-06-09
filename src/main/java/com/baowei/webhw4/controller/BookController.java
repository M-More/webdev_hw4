package com.baowei.webhw4.controller;

import java.util.List;

import com.baowei.webhw4.service.BookService;
import com.baowei.webhw4.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/findOne")
    public Book findOne(HttpServletRequest request, @RequestParam("bookIsbn") String bookIsbn){
        Book book = bookService.findBookByIsbn(bookIsbn);
//        List<Book> bookList = new LinkedList<>();
//        bookList.add(book);
        return book;
    }

    @RequestMapping("/delete")
    public void delete(HttpServletRequest request, @RequestParam("bookIsbn") String bookIsbn) {
        bookService.deleteBook(bookIsbn);
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request, @RequestParam("bookName") String bookName,
                       @RequestParam("bookAuthor") String bookAuthor, @RequestParam("bookIsbn") String bookIsbn,
                      @RequestParam("bookPress") String bookPress, @RequestParam("bookSize") String bookSize,
                       @RequestParam("bookPubtime") String bookPubtime, @RequestParam("bookIntro") String bookIntro,
                       @RequestParam("bookInventory") int bookInventory, @RequestParam("bookCover") String bookCover) {
        bookService.updateBook(bookName,bookAuthor,bookIsbn,bookPress,bookSize,bookPubtime,bookIntro,bookInventory,bookCover);
    }

    @RequestMapping("/create")
    public void create(HttpServletRequest request, @RequestParam("bookName") String bookName,
                       @RequestParam("bookAuthor") String bookAuthor, @RequestParam("bookIsbn") String bookIsbn,
                       @RequestParam("bookPress") String bookPress, @RequestParam("bookSize") String bookSize,
                       @RequestParam("bookPubtime") String bookPubtime, @RequestParam("bookIntro") String bookIntro,
                       @RequestParam("bookInventory") int bookInventory, @RequestParam("bookCover") String bookCover) {
        bookService.createBook(bookName,bookAuthor,bookIsbn,bookPress,bookSize,bookPubtime,bookIntro,bookInventory,bookCover);
    }
}
