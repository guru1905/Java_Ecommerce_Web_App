package com.example.javawebapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {
    @RequestMapping("/")

    public String welcome(){
        return "Welcome to MY first java web app";
    }
}
