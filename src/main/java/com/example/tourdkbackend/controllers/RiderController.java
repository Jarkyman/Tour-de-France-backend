package com.example.tourdkbackend.controllers;

import com.example.tourdkbackend.models.Rider;
import com.example.tourdkbackend.services.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RiderController {

    @Autowired RiderRepository riderRepository;

    @GetMapping("/riders")
    public List<Rider> getAllRiders() {
        return riderRepository.findAll();
    }

    @PostMapping("/create/rider")
    public ResponseEntity<String> createRider(@RequestBody Rider rider) {
        try {
            riderRepository.save(rider);
            return new ResponseEntity<>(rider.getFirstName() + " " + rider.getLastName() + " is created", HttpStatus.CREATED);
        }catch (Exception e) {
            return new ResponseEntity<>("Something went wrong while creating a new rider.\nError msg: " + e, HttpStatus.NOT_ACCEPTABLE);
        }
    }

}
