package com.baowei.webhw4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baowei.webhw4.vo.Book;
import com.baowei.webhw4.repository.BookRepository;
import com.baowei.webhw4.service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    /*
     * 查询所有书籍
     */

    @Override
    public List<Book> findAllBook(){
        return bookRepository.findAll();
    }


    @Override
    public void deleteBook(String bookIsbn) {
        bookRepository.deleteById(bookIsbn);
    }

    @Override
    public void updateBook(String bookName, String bookAuthor, String bookIsbn, float bookPrice, int bookInventory) {
        Book book = new Book(bookName,bookAuthor,bookIsbn,bookPrice,bookInventory);
        bookRepository.save(book);
    }

    @Override
    public void createBook(String bookName, String bookAuthor, String bookIsbn, float bookPrice, int bookInventory) {
        Book book = new Book(bookName,bookAuthor,bookIsbn,bookPrice,bookInventory);
        bookRepository.save(book);
    }
}
