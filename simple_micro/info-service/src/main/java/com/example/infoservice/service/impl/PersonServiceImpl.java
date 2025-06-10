package com.example.infoservice.service.impl;

import com.example.infoservice.entity.Person;
import com.example.infoservice.repository.PersonRepository;
import com.example.infoservice.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }
}
