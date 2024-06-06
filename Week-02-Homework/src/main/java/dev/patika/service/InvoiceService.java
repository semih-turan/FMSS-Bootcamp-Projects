package dev.patika.service;

import dev.patika.model.Invoice;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceService {
    private final List<Invoice> invoices;

    public InvoiceService() {
        this.invoices = new ArrayList<>();
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
    }

    public List<Invoice> getAllInvoices() {
        return new ArrayList<>(invoices);
    }

    public List<Invoice> getInvoicesAboveAmount(double amount) {
        return invoices.stream()
                .filter(i -> i.getAmount() > amount)
                .collect(Collectors.toList());
    }

    public double getAverageOfInvoicesAboveAmount(double amount) {
        return invoices.stream()
                .filter(i -> i.getAmount() > amount)
                .mapToDouble(Invoice::getAmount)
                .average()
                .orElse(0);
    }

    public List<Invoice> getInvoicesBelowAmount(double amount) {
        return invoices.stream()
                .filter(i -> i.getAmount() < amount)
                .collect(Collectors.toList());
    }
}
