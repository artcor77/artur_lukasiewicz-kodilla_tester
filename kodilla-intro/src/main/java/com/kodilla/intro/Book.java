package com.kodilla.intro;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title) {
        Book book = new Book(author, title);
        System.out.println("Title: " + title + ", " + "Author: " + author);
        return book;
    }

    public static void main(String[] args) {
        Book book = Book.of("J.R.R. Tolkien","The Lord of The Rings");
    }
}
