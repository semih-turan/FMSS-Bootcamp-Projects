package com.fmss.model;

import java.math.BigDecimal;

public class Book extends Product {
    private Author author;

    public Book(String name, BigDecimal price, String description, Publisher publisher,Author author) {
        super(name, price, description, publisher);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                '}';
    }
}
