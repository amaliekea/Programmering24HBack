package org.example.programmering24h.controller;


import org.example.programmering24h.model.Person;
import org.example.programmering24h.repositories.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/persons")
public class PersonController {
//hej
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
