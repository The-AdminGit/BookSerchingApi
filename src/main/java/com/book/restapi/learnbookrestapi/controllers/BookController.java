package com.book.restapi.learnbookrestapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> list =bookService.getAllBooks();
        if(list.size() <= 0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
     return ResponseEntity.status(HttpStatus.CREATED).body(list) ;
    }
    //get single book handle

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        Book book =bookService.getBookById(id);
        if(book ==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return  ResponseEntity.of(Optional.of(book));
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

    @PutMapping("/books/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId){
        this.bookService.bookUpdate(book,bookId);
        return book;
    }
}
