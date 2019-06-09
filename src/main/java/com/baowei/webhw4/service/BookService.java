package com.baowei.webhw4.service;
import java.util.List;
import com.baowei.webhw4.entity.Book;

public interface BookService {
    List<Book> findAllBook();

    Book findBookByIsbn(String isbn);

    void createBook(String bookName, String bookAuthor, String bookIsbn, String bookPress, String bookSize,
                    String bookPubtime, String bookIntro, int bookInventory, String bookCover);

    void updateBook(String bookName, String bookAuthor, String bookIsbn, String bookPress, String bookSize,
                    String bookPubtime, String bookIntro, int bookInventory, String bookCover);

    void deleteBook(String bookIsbn);
}
