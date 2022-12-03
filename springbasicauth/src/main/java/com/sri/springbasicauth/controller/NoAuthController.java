package com.sri.springbasicauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noauth/rest")
public class NoAuthController {
    @GetMapping("/sayhi")
    public String sayHi(){
        return "Sorry Ganesha no auth here!!";
    }
}