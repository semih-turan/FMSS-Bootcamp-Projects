package com.fmss.model;

import java.time.LocalDate;

public class Publisher {

    private String name;
    private LocalDate createDate;
    // private List<Book> bookList; // model olarak bunu yapmadik.

    public Publisher(String name, LocalDate createDate) {
        this.name = name;
        this.createDate = createDate;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
