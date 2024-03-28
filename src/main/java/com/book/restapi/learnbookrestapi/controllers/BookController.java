package com.book.restapi.learnbookrestapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.restapi.learnbookrestapi.entities.Book;

@RestController
public class BookController {

    //user send data url(value) and get method (get) 
    // @RequestMapping(value ="/hello", method = RequestMethod.GET)

    @GetMapping("/book")
    public Book getBook() {
        Book book = new Book();
        book.setId(1);
        book.setName("java");
        book.setAuther("gemse goslin");

        return book;
    }
}
