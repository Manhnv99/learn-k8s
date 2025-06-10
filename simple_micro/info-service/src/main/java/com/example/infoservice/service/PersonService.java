package com.example.infoservice.service;

import com.example.infoservice.entity.Person;

import java.util.List;

public interface PersonService {

    Person createPerson(Person person);

    List<Person> getPersons();

}
