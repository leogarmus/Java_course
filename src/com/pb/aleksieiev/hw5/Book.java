package com.pb.aleksieiev.hw5;

public class Book {
    private  String bookName;
    private String author;
    private int year;

    public Book (String bookName, String author, int year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }

    public String getBookName(){
        return bookName;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

}
