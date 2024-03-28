package com.book.restapi.learnbookrestapi.services;

import java.util.ArrayList;
import java.util.List;

import com.book.restapi.learnbookrestapi.entities.Book;

public class BookService {
    
    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(1,"java Book","gemse goslin"));
        list.add(new Book(2,"javaScript Book","xyz"));
        list.add(new Book(3,"python Book","abc"));
    }
}
