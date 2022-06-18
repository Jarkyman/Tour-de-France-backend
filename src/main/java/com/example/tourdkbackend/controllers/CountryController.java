package com.example.tourdkbackend.controllers;

import com.example.tourdkbackend.models.Country;
import com.example.tourdkbackend.Repository.CountryRepository;
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

    /**
     * Get a list of all countries participating in Tour de France
     *
     * @return a list of countries
     */
    @GetMapping("/countries")
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

}
