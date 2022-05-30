package com.example.tourdkbackend.controllers;

import com.example.tourdkbackend.models.Country;
import com.example.tourdkbackend.services.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

}
