package com.baowei.webhw4.service;
import java.util.List;
import com.baowei.webhw4.vo.Book;

public interface BookService {
    List<Book> findAllBook();

    void createBook(String bookName, String bookAuthor, String bookIsbn, float bookPrice, int bookInventory);

    void updateBook(String bookName, String bookAuthor, String bookIsbn, float bookPrice, int bookInventory);

    void deleteBook(String bookIsbn);
}
