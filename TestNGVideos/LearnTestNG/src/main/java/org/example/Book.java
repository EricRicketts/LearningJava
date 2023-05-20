package org.example;

import java.math.BigDecimal;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int year;
    private BigDecimal cost;

    public Book(String title, String author, String publisher, int year, BigDecimal cost) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.cost = cost;
    }

    public Book() {}

    // getters

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public int getYear() {
        return this.year;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    // setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    // provide details of the book

    public String toString() {
        return "The details of the book are:\n" +
                "title: " + getTitle() + "\n" +
                "author: " + getAuthor() + "\n" +
                "publisher: " + getPublisher() + "\n" +
                "year: " + getYear() + "\n" +
                "cost: " + getCost() + "\n";
    }
}
