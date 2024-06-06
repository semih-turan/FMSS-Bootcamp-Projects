package dev.patika.service;

import dev.patika.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    private final List<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customers);
    }

    public List<Customer> getCustomersWithCInName() {
        return customers.stream()
                .filter(c -> c.getName().contains("C"))
                .collect(Collectors.toList());
    }

    public List<Customer> getCustomersWithInvoicesInJune() {
        return customers.stream()
                .filter(c -> c.getInvoices().stream()
                        .anyMatch(i -> i.getDate().getMonthValue() == 6))
                .collect(Collectors.toList());
    }
}
