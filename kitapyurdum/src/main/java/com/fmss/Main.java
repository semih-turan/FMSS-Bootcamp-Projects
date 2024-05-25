package com.fmss;

import com.fmss.model.Customer;
import com.fmss.model.Order;
import com.fmss.model.Product;
import com.fmss.model.Publisher;
import com.fmss.model.enums.AccountType;
import com.fmss.service.CustomerService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        customerService.createCustomer("Semih", "Turan","s@t.gmail.com","1234");
        customerService.createCustomer("Erkan", "Karaca","e@k.gmail.com","1234);

        customerSer
        List<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer("Semih", "Turan","s@t.gmail.com","1234");
        customerList.add(customer1);
        customer1.setAccountType(AccountType.GOLD);

        Customer customer2 = new Customer("Erkan", "Karaca","e@k.gmail.com","1234");
        customerList.add(customer2);

        Customer customer3 = new Customer("Berke", "Gurel","b@g.gmail.com","1234");
        customerList.add(customer3);

        customer1.setOrderList(prepareOrderList());


        customerList.forEach(System.out::println);

        Set<Publisher> publishers = new HashSet<>();
        Publisher publisher1 = new Publisher("Can Yaiyinlari", LocalDate.now().minusYears(10));
        Publisher publisher2 = new Publisher("Dergah Yaiyinlari", LocalDate.now().minusYears(1));
        publishers.add(publisher1);
        publishers.add(publisher2);

        Set<Product> productSet = new HashSet<>();
        Product product1 =prepareProduct("Seker Portakali", new BigDecimal("90,22"),"Lorem ipsum", publisher1);
        productSet.add(product1);

        Product product2 =prepareProduct("Korluk", new BigDecimal("122,22"),"Lorem ipsum", publisher2);
        productSet.add(product2);

        Product product3 =prepareProduct("Saatleri Ayarlama Enstitusu", new BigDecimal("150,22"),"Lorem ipsum", publisher1);
        productSet.add(product3);


        // order

        customer1.getOrderList().add();
        listOrderByEmail("S@tGmail.com");

    }

    private static void listOrderByEmail(String email) {
        List<Order> orderList = customerList.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .flatMap(customer -> customer.getOrderList().stream())
                .toList();
        orderList.forEach(System.out::println);
    }

    private static Order prepareOrder() {
        // Order order = new Order(); Bunu tercih etmiyoruz cunku direk donus yapiyoruz.
        return new Order(prepareProductList(),"order123");
    }

    private static List<Order> prepareOrderList() {
        return List.of(prepareOrder());
    }


    private static List<Product> prepareProductList() {
        return List.of(prepareProduct());
    }

    private static Product prepareProduct(String name,  BigDecimal amount, String description, Publisher publisher) {
        Product product = new Product(name,amount,description,publisher);
        return product;
    }
}