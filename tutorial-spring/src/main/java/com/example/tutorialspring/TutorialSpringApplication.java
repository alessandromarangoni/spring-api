package com.example.tutorialspring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "it.betacom.student")
public class TutorialSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(TutorialSpringApplication.class, args);
    }
}