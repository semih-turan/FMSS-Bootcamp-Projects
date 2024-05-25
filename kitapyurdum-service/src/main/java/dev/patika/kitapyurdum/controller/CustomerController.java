package dev.patika.kitapyurdum.controller;

import dev.patika.kitapyurdum.model.Customer;
import dev.patika.kitapyurdum.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping()
    public void save(@RequestBody Customer customer){ // Jackson ile customer a cevir ve save et
        customerService.save(customer);
    }

    @GetMapping()
    public List<Customer> getAll(){
        customerService.getCustomerList();
    }

    @GetMapping("/{id}")
    public Customer getById(){
        customerService.getById();
    }



}
