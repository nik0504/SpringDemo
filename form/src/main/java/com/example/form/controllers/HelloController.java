package com.example.form.controllers;

import com.example.form.database.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public Person sayHello(
            @RequestParam(required =false,defaultValue = "Nikhil") String firstName,
            @RequestParam(required =false,defaultValue = "Bansal") String lastName){
//        model.addAttribute("user",name);

        return new Person(1,firstName,lastName);
    }
}

