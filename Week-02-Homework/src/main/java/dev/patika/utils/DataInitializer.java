package dev.patika.utils;

import dev.patika.model.Customer;
import dev.patika.model.Invoice;
import dev.patika.service.CustomerService;
import dev.patika.service.InvoiceService;

import java.time.LocalDate;

public class DataInitializer {
    public static void initialize(CustomerService customerService, InvoiceService invoiceService) {
        Customer customer1 = new Customer(1, "Alice", "IT");
        Customer customer2 = new Customer(2, "Bob", "Finance");
        Customer customer3 = new Customer(3, "Charlie", "Retail");

        Invoice invoice1 = new Invoice(1, 1200, LocalDate.of(2023, 6, 15));
        Invoice invoice2 = new Invoice(2, 800, LocalDate.of(2023, 6, 10));
        Invoice invoice3 = new Invoice(3, 3000, LocalDate.of(2023, 5, 5));

        customer1.addInvoice(invoice1);
        customer2.addInvoice(invoice2);
        customer3.addInvoice(invoice3);

        customerService.addCustomer(customer1);
        customerService.addCustomer(customer2);
        customerService.addCustomer(customer3);

        invoiceService.addInvoice(invoice1);
        invoiceService.addInvoice(invoice2);
        invoiceService.addInvoice(invoice3);
    }
}
