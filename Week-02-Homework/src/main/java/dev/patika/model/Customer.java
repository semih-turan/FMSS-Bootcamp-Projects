package dev.patika.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final int id;
    private String name;
    private String sector;
    private final List<Invoice> invoices;

    public Customer(int id, String name, String sector) {
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.invoices = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
    }
}
