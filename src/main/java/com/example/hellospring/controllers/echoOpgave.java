package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class echoOpgave {
    //Opgave 1.2
    @GetMapping("/echo")
    public String requestParm(@RequestParam String color){
        return "the color of the parameter "+ color;
    }
}
