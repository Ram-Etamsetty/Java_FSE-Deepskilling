package com.example.jwtauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConroller {
    @GetMapping("/hello")
    public String hello() {

        return "Welcome! JWT Authentication Successful";

    }
}
