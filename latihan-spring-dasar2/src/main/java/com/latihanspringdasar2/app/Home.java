package com.latihanspringdasar2.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {
    @GetMapping("home3")
    public String home(){
        return "Welcome to home";
    }
}
