package com.fmss;

import com.fmss.model.Product;

import java.math.BigDecimal;

public class Book extends Product {
    public Book(String name, BigDecimal price, String description) {
        super(name, price, description);
    }
}
