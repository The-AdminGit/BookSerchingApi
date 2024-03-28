package com.book.restapi.learnbookrestapi.entities;

public class Book {
    private int id;
    private String name;
    private String auther;

    public Book(int id, String name, String auther) {
        this.id = id;
        this.name = name;
        this.auther = auther;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", auther=" + auther + "]";
    }

}
