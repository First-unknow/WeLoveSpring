package com.wow.demo.service;

import com.wow.demo.model.Person;
import com.wow.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository pr;
    public Person findById(int i) {
        return pr.findById(Long.valueOf(i)).get();
    }
}
