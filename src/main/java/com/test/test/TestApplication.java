package com.test.test;

import com.test.test.DB.DBHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "com.test.test") // Adjust package as necessary

public class TestApplication {
    @Autowired
    DBHandler dbInit;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);

    }

    @Bean
    public void init() {
        this.dbInit.init();

    }

}
