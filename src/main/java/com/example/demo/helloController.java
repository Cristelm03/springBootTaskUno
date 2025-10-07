package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/")
    public String hello() {
        return "!Hola desde Spring Boot¡ Soy Florecita Cristel Morales Lux";
    }

}
