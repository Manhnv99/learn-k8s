package com.example.infoservice.controller;

import com.example.infoservice.entity.Person;
import com.example.infoservice.service.PersonService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class InfoController {

    private final HttpServletRequest request;

    private int size;

    private final PersonService personService;

    @GetMapping("/info")
    public ResponseEntity<?> getInfo() {
        log.info("size: {}", size += 1);
        return ResponseEntity.ok("Hello World" + " " + request.getRemoteHost());
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return ResponseEntity.ok(personService.createPerson(person));
    }

    @GetMapping
    public ResponseEntity<List<Person>> getPerson() {
        return ResponseEntity.ok(personService.getPersons());
    }

}
