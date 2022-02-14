package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;


@RestController
public class EkstraOpgaverFordiJegKederMig {

    @GetMapping("/duplicate")
    public String duplicateWord(){
        String test = "";
        for (int i = 0; i < 50; i++) {
            test += "OmegaLul ";

        }
        return test;
    }
    //Når du kommer ind på hjemmesiden gå tilbage på Intlj og skriv hvad der skal stå på hjemmesiden, mens den loader
    @GetMapping("/scanner")
    public String scannerTry(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Try write something: ");
        String userInput = scanner.nextLine();

        return userInput;
    }

}
