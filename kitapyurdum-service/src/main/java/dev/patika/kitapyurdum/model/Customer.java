package dev.patika.kitapyurdum.model;

import dev.patika.kitapyurdum.model.enums.AccountType;
import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE) // disardan bos constructor a ulasmiyorsun
public class Customer {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Integer credit;
    private String phoneNumber;
    private Set<Address> addresses;
    private Boolean isActive;
    private AccountType accountType;

    public Customer(String name,String surname,String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
}
