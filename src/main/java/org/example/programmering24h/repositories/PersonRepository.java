package org.example.programmering24h.repositories;

import org.example.programmering24h.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
