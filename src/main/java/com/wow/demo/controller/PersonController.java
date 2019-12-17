package com.wow.demo.controller;

import com.wow.demo.model.Person;
import com.wow.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonService ps;

    @GetMapping("/person")
    public Person getPerson(){
        return ps.findById(1);
    }
}
