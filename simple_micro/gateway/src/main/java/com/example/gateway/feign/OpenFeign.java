package com.example.gateway.feign;

import com.example.gateway.request.PersonRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "info-service", url = "${info.service}/api/v1")
public interface OpenFeign {

    @GetMapping("/info")
    ResponseEntity<String> getInfo();

    @PostMapping
    ResponseEntity<PersonRequest> createPerson(PersonRequest personRequest);

    @GetMapping
    ResponseEntity<List<PersonRequest>> getAll();

}
