package com.nidan.vitals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.nidan.vitals.repository")
public class NidanVitalsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NidanVitalsApplication.class, args);
    }
}
