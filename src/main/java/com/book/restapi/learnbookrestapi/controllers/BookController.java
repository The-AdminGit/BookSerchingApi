package com.book.restapi.learnbookrestapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.book.restapi.learnbookrestapi.entities.Book;
import com.book.restapi.learnbookrestapi.services.BookService;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public List<Book> getBooks() {
     return this.bookService.getAllBooks();
    }
    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable int id){
        return this.bookService.getBookById(id);
    }
}
