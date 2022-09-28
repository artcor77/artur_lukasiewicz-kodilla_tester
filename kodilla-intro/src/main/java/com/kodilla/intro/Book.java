package com.kodilla.intro;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    public static String of(String author, String title){
        Book book = new Book(author, title);
        return book.of(author, title);
    }

    public static void main(String[] args){
        String book = Book.of("AAA","AAA");

    }

}
