package com.fmss.service;

import com.fmss.model.Customer;
import com.fmss.model.enums.AccountType;
import com.fmss.repository.CustomRepository;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    public void createCustomer(String name, String surname, String email, String password) {
        CustomRepository customerRepository = new CustomRepository();

        Customer customer1 = new Customer(name, surname,email,password);

        customerRepository.createCustomer(customer1);
    }

    public List<Customer> getCustomerList() {
        CustomRepository customerRepository = new CustomRepository();
        return customerRepository.getCustomerList();
    }

    public void changeAccountTypeByCredit(String email, AccountType accountType){ // odev
        Optional<Customer> foundCustomer = getCustomerList()
                .stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findFirst();
        if(foundCustomer.isPresent()){
            foundCustomer.get().setAccountType(accountType);
        }
    }


}
