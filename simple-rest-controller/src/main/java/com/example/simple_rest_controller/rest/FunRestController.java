package com.example.simple_rest_controller.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
