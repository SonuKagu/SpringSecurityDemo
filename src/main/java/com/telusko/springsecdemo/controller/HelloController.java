package com.telusko.springsecdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String welcome(HttpServletRequest request) {
        return "Welcome " + request.getSession().getId();
    }

    @GetMapping("hello")
    public String greet(HttpServletRequest request) {
        return "Hello World " + request.getSession().getId();
    }
}
