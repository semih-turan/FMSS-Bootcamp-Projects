package dev.patika.kitapyurdum.repository;

import dev.patika.kitapyurdum.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepository {


    private List<Customer> customerList = new ArrayList<>();

    public void createCustomer(Customer customer) {
        customerList.add(customer);
    }

    public List<Customer> getCustomerList() {return customerList;}

    public Optional<Customer> findById(Long id) {
        return getCustomerList().stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst();
    }

    public Optional<Customer> findByEmail(String email) {
        return getCustomerList().stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findFirst();
    }

}
