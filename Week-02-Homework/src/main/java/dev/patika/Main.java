package dev.patika;

import dev.patika.service.CustomerService;
import dev.patika.service.InvoiceService;
import dev.patika.utils.DataInitializer;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        InvoiceService invoiceService = new InvoiceService();

        // Initialize data
        DataInitializer.initialize(customerService, invoiceService);

        // Listeleme işlemleri
        System.out.println("Tüm müşteriler:");
        customerService.getAllCustomers().forEach(c -> System.out.println(c.getName()));

        System.out.println("\nİçerisinde 'C' harfi olan müşteriler:");
        customerService.getCustomersWithCInName().forEach(c -> System.out.println(c.getName()));

        System.out.println("\nHaziran ayında kayıt olan müşterilerin faturaları:");
        customerService.getCustomersWithInvoicesInJune().forEach(c ->
                c.getInvoices().forEach(i -> System.out.println(i.getAmount())));

        System.out.println("\nSistemdeki tüm faturalar:");
        invoiceService.getAllInvoices().forEach(i -> System.out.println(i.getAmount()));

        System.out.println("\n1500TL üstündeki faturalar:");
        invoiceService.getInvoicesAboveAmount(1500).forEach(i -> System.out.println(i.getAmount()));

        System.out.println("\n1500TL üstündeki faturaların ortalaması:");
        System.out.println(invoiceService.getAverageOfInvoicesAboveAmount(1500));

        System.out.println("\n500TL altındaki faturalara sahip müşterilerin isimleri:");
        invoiceService.getInvoicesBelowAmount(500).forEach(i ->
                customerService.getAllCustomers().stream()
                        .filter(c -> c.getInvoices().contains(i))
                        .forEach(c -> System.out.println(c.getName())));
    }
}