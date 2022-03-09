package com.quinbay.march22.dependency.injection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/great")
    public String great(){
        return "Hello";
    }
}
