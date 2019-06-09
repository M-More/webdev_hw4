package com.baowei.webhw4.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baowei.webhw4.entity.Book;
import com.baowei.webhw4.repository.BookRepository;
import com.baowei.webhw4.service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAllBook(){
        return bookRepository.findAll();
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        return bookRepository.findBookByIsbn(isbn);
    }

    @Override
    public void deleteBook(String bookIsbn) {
        bookRepository.deleteById(bookIsbn);
    }

    @Override
    public void updateBook(String bookName, String bookAuthor, String bookIsbn, String bookPress, String bookSize,
                           String bookPubtime, String bookIntro, int bookInventory, String bookCover) {
        Book book = new Book(bookName,bookAuthor,bookIsbn,bookPress,bookSize,bookPubtime,bookIntro,bookInventory,bookCover);
        bookRepository.save(book);
    }

    @Override
    public void createBook(String bookName, String bookAuthor, String bookIsbn, String bookPress, String bookSize,
                    String bookPubtime, String bookIntro, int bookInventory, String bookCover) {
        Book book = new Book(bookName,bookAuthor,bookIsbn,bookPress,bookSize,bookPubtime,bookIntro,bookInventory,bookCover);
        bookRepository.save(book);
    }
}
