package com.example.companyservice.companyservice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class ApplicationController {

    @Value("${description}")
    private String description;

    @GetMapping
    public String getTestProperty() {
        return description;
    }
}
