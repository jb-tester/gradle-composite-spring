package com.mytests.spring.springmodnodep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringModNodepApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringModNodepApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************");
        System.out.println("This Application doesn't depend on different project modules");
        System.out.println("**********************************");;
    }
}
