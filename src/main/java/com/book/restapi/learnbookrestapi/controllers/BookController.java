package com.book.restapi.learnbookrestapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.restapi.learnbookrestapi.entities.Book;
import com.book.restapi.learnbookrestapi.services.BookService;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    //get all book handle
    @GetMapping("/books")
    public List<Book> getBooks() {
     return this.bookService.getAllBooks();
    }
    //get single book handle
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id){
        return this.bookService.getBookById(id);
    }
    //create book handler
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        Book b=this.bookService.addBook(book);
        return b;
    }
    //delete book hander
    @DeleteMapping("/books/{bookId}")
    public void deletebBook(@PathVariable("bookId") int bookId ){
        this.bookService.bookDelete(bookId);
    }
}
