package com.fmss;

import com.fmss.model.Customer;
import com.fmss.model.Order;
import com.fmss.model.Product;
import com.fmss.model.enums.AccountType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer("Semih", "Turan","s@t.gmail.com","1234");
        customerList.add(customer1);
        customer1.setAccountType(AccountType.GOLD);

        Customer customer2 = new Customer("Erkan", "Karaca","e@k.gmail.com","1234");
        customerList.add(customer2);

        Customer customer3 = new Customer("Berke", "Gurel","b@g.gmail.com","1234");
        customerList.add(customer3);

        customer1.setOrderList(prepareOrderList());

        List<Order> semOrders = customerList.stream()
                .filter(customer -> customer.getEmail().equals("s@t.gmail.com"))
                .flatMap(customer -> customer.getOrderList().stream())
                .toList();
        semOrders.forEach(System.out::println);
        customerList.forEach(System.out::println);
    }

    private static List<Order> prepareOrderList() {
        return List.of(prepareOrder());
    }
    private static Order prepareOrder() {
        // Order order = new Order(); Bunu tercih etmiyoruz cunku direk donus yapiyoruz.
        return new Order(prepareProductList(),"order123");
    }

    private static List<Product> prepareProductList() {
        return List.of(prepareProduct());
    }

    private static Product prepareProduct() {
        Product product = new Product("Soyleme Bilmesinler", new BigDecimal(118.82),"Yalansiz artik. Hala bircak sirri...");
        return product;
    }
}