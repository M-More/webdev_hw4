package com.baowei.webhw4.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.baowei.webhw4.entity.Book;

public interface BookRepository extends MongoRepository<Book,String> {

    Book findBookByIsbn(String Isbn);

}

