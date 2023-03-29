package com.mytests.spring.springMod;

import org.example.SomeClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringModApplication implements CommandLineRunner {
    @Bean
    public SomeClass someClass() {
        return new SomeClass("This Spring application depends on common-mod module");
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringModApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************");
        System.out.println(someClass().getGreeting());
        System.out.println("**********************************");;
    }
}
