package dev.patika.kitapyurdum;

import dev.patika.kitapyurdum.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KitapyurdumServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KitapyurdumServiceApplication.class, args);
    }

}
