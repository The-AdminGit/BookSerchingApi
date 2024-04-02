package com.book.restapi.learnbookrestapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.restapi.learnbookrestapi.dao.BookRepository;
import com.book.restapi.learnbookrestapi.entities.Book;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // private static List<Book> list = new ArrayList<>();

    // static{
    // list.add(new Book(1,"java Book","gemse goslin"));
    // list.add(new Book(2,"javaScript Book","xyz"));
    // list.add(new Book(3,"python Book","abc"));
    // }

    // get all books

    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) this.bookRepository.findAll();
        return list;
    }

    // get single book by id
    public Book getBookById(int id) {
        Book book = null;
        try {
            // book = list.stream().filter(e ->e.getId() == id).findFirst().get();
            book = this.bookRepository.findById(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    // create(post) book
    public Book addBook(Book book) {
        // list.add(book);
        Book result = this.bookRepository.save(book);
        return result;
    }

    // delete book by id
    public void bookDelete(int bid) {
        // list = list.stream().filter(book -> book.getId()
        // !=bid).collect(Collectors.toList());
        bookRepository.deleteById(bid);
    }

    // update books data
    public void bookUpdate(Book book, int bookId) {
        // list = list.stream().map(b -> {
        // if(b.getId() == bookId){
        // b.setName(book.getName());
        // b.setAuther(book.getAuther());
        // }
        // return b;
        // }).collect(Collectors.toList());
        book.setId(bookId);
        bookRepository.save(book);
    }

}
