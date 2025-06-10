package com.example.gateway.controller;

import com.example.gateway.feign.OpenFeign;
import com.example.gateway.request.PersonRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class GatewayController {

    private final OpenFeign openFeign;


    @GetMapping("/info")
    public ResponseEntity<?> getInfo() {
        return openFeign.getInfo();
    }

    @PostMapping
    public ResponseEntity<PersonRequest> createPerson(@RequestBody PersonRequest personRequest) {
        return openFeign.createPerson(personRequest);
    }

    @GetMapping
    public ResponseEntity<List<PersonRequest>> getAll() {
        return openFeign.getAll();
    }

}
