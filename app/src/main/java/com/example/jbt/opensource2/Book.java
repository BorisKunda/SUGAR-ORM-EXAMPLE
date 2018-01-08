package com.example.jbt.opensource2;

import com.orm.SugarRecord;

public class Book extends SugarRecord {

    public Book() {

    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    String title;
    String author;
    int pages;
}
