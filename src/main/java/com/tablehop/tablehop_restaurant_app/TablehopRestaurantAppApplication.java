package com.tablehop.tablehop_restaurant_app;

import com.tablehop.tablehop_restaurant_app.entity.User;
import com.tablehop.tablehop_restaurant_app.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.tablehop.tablehop_restaurant_app" })
@EntityScan("com.tablehop.tablehop_restaurant_app.entity")
@EnableJpaRepositories("com.tablehop.tablehop_restaurant_app.repository")
public class TablehopRestaurantAppApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public TablehopRestaurantAppApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TablehopRestaurantAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("username","mail","phone","address");
        userRepository.save(user);

    }
}