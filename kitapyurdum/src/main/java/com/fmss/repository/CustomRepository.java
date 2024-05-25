package com.fmss.repository;

import com.fmss.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomRepository {

    private List<Customer> customerList =new ArrayList<Customer>();

    public void createCustomer(Customer customer) {
        customerList.add(customer);
    }

    public List<Customer> getCustomerList() {}
}
