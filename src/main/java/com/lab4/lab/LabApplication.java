package com.lab4.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LabApplication {

    public static void main(String[] args) {
        SpringApplication.run(
            LabApplication.class, args);
    }

    // Q1 - Basic greet endpoint
    @GetMapping("/greet")
    public String greetEndpoint() {
        return "Welcome to Spring Boot!";
    }

    // Q2 - Greet with name and optional message
    @GetMapping("/greet/{name}")
    public String greetWithName(
        @PathVariable String name, 
        @RequestParam(required = false) String message) {
        if (message != null && !message.isEmpty()) {
            return "Hello " + name + "! " + message;
        } else {
            return "Hello " + name + "! Welcome to Spring Boot!";
        }
    }
}