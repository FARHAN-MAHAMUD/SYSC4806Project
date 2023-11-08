package com.aws.codestar.projecttemplates;

public class Book {

    private String title;
    private String author;
    private final long ISBN;

    public Book(String title, String author, long ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}
