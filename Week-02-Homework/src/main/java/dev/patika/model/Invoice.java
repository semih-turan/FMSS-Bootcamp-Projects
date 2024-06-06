package dev.patika.model;

import java.time.LocalDate;

public class Invoice {
    private final int id;
    private final double amount;
    private final LocalDate date;

    public Invoice(int id, double amount, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}
