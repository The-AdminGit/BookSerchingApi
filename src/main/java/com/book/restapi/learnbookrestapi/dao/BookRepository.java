package com.book.restapi.learnbookrestapi.dao;

import org.springframework.data.repository.CrudRepository;

import com.book.restapi.learnbookrestapi.entities.Book;

public interface BookRepository  extends CrudRepository<Book, Integer>{
    public Book findById(int id);
}
