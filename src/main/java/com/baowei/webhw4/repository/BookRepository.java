package com.baowei.webhw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baowei.webhw4.entity.Book;

public interface BookRepository extends JpaRepository<Book,String> {

    Book findBookByIsbn(String isbn);

}

