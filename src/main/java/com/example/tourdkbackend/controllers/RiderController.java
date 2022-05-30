package com.example.tourdkbackend.controllers;

import com.example.tourdkbackend.models.Rider;
import com.example.tourdkbackend.services.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class RiderController {

    @Autowired RiderRepository riderRepository;

    /**
     * Get a list of all riders created.
     *
     * @return a list of riders
     */
    @GetMapping("/riders")
    public List<Rider> getAllRiders() {
        return riderRepository.findAll();
    }

    /**
     * Create a new rider, and save it in the database.
     *
     * @param rider to save
     * @return request message and HTTP status code
     */
    @PostMapping("/create/rider")
    public ResponseEntity<String> createRider(@RequestBody Rider rider) {
        try {
            riderRepository.save(rider);
            return new ResponseEntity<>(rider.getFirstName() + " " + rider.getLastName() + " is created", HttpStatus.CREATED);
        }catch (Exception e) {
            return new ResponseEntity<>("Something went wrong while creating a new rider.\nError msg: " + e, HttpStatus.NOT_ACCEPTABLE);
        }
    }

    /**
     * Update a rider, with an existing rider.
     *
     * @param id wanted to update
     * @param rider object with updated data
     * @return request message and HTTP status code
     */
    @PutMapping("/update/rider/{id}")
    public ResponseEntity<String> updateRider(@PathVariable int id, @RequestBody Rider rider) {
        rider.setRiderId(id); //set id to the one to edit
        Optional<Rider> optionalRider = riderRepository.findById(id);
        try {
            if (optionalRider.isPresent()) {
                riderRepository.save(rider);
                return new ResponseEntity<>("Updated " + rider.getFirstName() + " " + rider.getLastName() + " by id: " + id, HttpStatus.ACCEPTED);
            }
            return new ResponseEntity<>("No rider with id: " + id, HttpStatus.NOT_ACCEPTABLE);
        }catch (Exception e) {
            return new ResponseEntity<>("Update failed. no one with id: " + id + "\nError code: " + e, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Delete a rider, with a given id.
     *
     * @param id of rider to delete
     * @return request message and HTTP status code
     */
    @DeleteMapping("/delete/rider/{id}")
    public ResponseEntity<String> deleteRider(@PathVariable int id) {
        try {
            riderRepository.deleteById(id);
            return new ResponseEntity<>("deleted rider with id: " + id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(
                    "can't delete rider with id: " + id + "\n Error code: " + e, HttpStatus.NOT_FOUND);
        }
    }

}
