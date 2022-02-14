package com.example.hellospring.controllers;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.time.DayOfWeek;
import java.time.LocalDate;

@RestController

//Opgave 1.1
public class HelloSpringOpgave {

    @GetMapping("/hello")
    public String helloEverybody(){
        return "Hello Everybody";
    }

}
