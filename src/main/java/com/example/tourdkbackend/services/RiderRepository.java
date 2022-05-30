package com.example.tourdkbackend.services;

import com.example.tourdkbackend.models.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderRepository extends JpaRepository<Rider, Integer> {}
