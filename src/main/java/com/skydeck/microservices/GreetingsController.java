package com.skydeck.microservices;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    
    @RequestMapping("/main")
    public String hello() {
        return "Hello! The time is " + new Date();
    }
}
