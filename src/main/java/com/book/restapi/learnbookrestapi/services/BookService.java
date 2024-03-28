package com.book.restapi.learnbookrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.book.restapi.learnbookrestapi.entities.Book;

@Controller
public class BookService {
    
    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(1,"java Book","gemse goslin"));
        list.add(new Book(2,"javaScript Book","xyz"));
        list.add(new Book(3,"python Book","abc"));
    }

    //get all books

    public List<Book> getAllBooks(){
        return list;
    }

    //get single book by id
    public Book getBookById(int id){
        Book book= null;
        book = list.stream().filter(e ->e.getId() == id).findFirst().get();
        return book;
    }
    
    //create(post) book 
    public Book addBook(Book book){
        list.add(book);
        return book;
    }
}
