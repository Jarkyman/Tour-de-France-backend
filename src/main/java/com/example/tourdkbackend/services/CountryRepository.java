package com.example.tourdkbackend.services;

import com.example.tourdkbackend.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {}
