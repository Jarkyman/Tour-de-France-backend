package com.example.tourdkbackend.Repository;

import com.example.tourdkbackend.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {}
