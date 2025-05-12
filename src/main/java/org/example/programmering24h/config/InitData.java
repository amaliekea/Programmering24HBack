package org.example.programmering24h.config;

import org.example.programmering24h.model.Person;
import org.example.programmering24h.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    private final PersonRepository personRepository;

    public InitData(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (personRepository.count() == 0) {
            personRepository.save(new Person(null, "Anders"));
            personRepository.save(new Person(null, "Maria"));
            personRepository.save(new Person(null, "Jonas"));
            System.out.println("Initierede testpersoner.");
        }
    }
}
