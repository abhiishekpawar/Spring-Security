package com.demo.BasicAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String greet(){
        return "welcome to basic authentication demo";
    }
}
