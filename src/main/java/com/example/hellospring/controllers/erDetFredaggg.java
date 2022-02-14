package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.time.DayOfWeek;
import java.time.LocalDate;

@RestController
public class erDetFredaggg {

    //Opgave 1.3 (min version)
    @GetMapping("/erDetFredag")
    public String erDetFredag(){
        LocalDate today = LocalDate.now();
        DayOfWeek todayReal = today.getDayOfWeek();
        String checkIfFredag = todayReal.toString();

        if (checkIfFredag.equalsIgnoreCase("friday")){
            return "Ja det er fredag din jens fan klub medlemmer.";
        }
        else{
            return "Det ik fredag tag tilbage til skole.";
        }
    }
    //En måde at linke til den rigtig erDetFredag hjemmeside
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public ModelAndView method() {
        String siteUrl = "https://www.erdetfredag.dk";
        return new ModelAndView("redirect:" + siteUrl);
    }
}
