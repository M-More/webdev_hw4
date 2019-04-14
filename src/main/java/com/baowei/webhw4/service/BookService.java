package com.baowei.webhw4.service;
import java.util.List;
import com.baowei.webhw4.vo.Book;

public interface BookService {
    List<Book> findAll();
    int create(String bookName, String bookAuthor, String bookIsbn, float bookPrice, int bookInventory);
    int update(String bookName, String bookAuthor, String bookIsbn, float bookPrice, int bookInventory);
    int delete(String bookIsbn);
}
