package com.fmss.model;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private String description;

    public Product(String name, BigDecimal price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
