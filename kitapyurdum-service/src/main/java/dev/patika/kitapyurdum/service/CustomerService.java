package dev.patika.kitapyurdum.service;

import dev.patika.kitapyurdum.model.Customer;
import dev.patika.kitapyurdum.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository; // Yonetim artik springde

//    @Autowired
//    public CustomerService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    public void save(Customer customer){
        customerRepository.createCustomer(customer);
    }

}
