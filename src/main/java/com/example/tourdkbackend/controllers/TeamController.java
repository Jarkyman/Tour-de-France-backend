package com.example.tourdkbackend.controllers;

import com.example.tourdkbackend.exceptions.TeamNotCreatedException;
import com.example.tourdkbackend.models.Rider;
import com.example.tourdkbackend.models.Team;
import com.example.tourdkbackend.Repository.RiderRepository;
import com.example.tourdkbackend.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    RiderRepository riderRepository;

    /**
     * Get a list of all teams created.
     *
     * @return a list of teams
     */
    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    /**
     * Get all riders from a specifik team
     *
     * @param id of the team
     * @return a list of riders
     */
    @GetMapping("/riders/team/old/{id}")
    public List<Rider> getRidersFromTeamOld(@PathVariable int id) {
        List<Rider> allRiders = riderRepository.findAll();
        List<Rider> ridersInTeam = new ArrayList<>();
        if (!allRiders.isEmpty()) {
            for (Rider rider : allRiders) {
                if (rider.getTeam().getTeamId() == id) {
                    ridersInTeam.add(rider);
                }
            }
        }
        return ridersInTeam;
    }

    /**
     * Get all riders from a specifik team
     *
     * @param id of the team
     * @return a list of riders
     */
    @GetMapping("/riders/team/{id}")
    public List<Rider> getRidersFromTeam(@PathVariable int id) {
        return riderRepository.findAllByTeamTeamId(id);
    }

    /**
     * Create a new team, and save it in the database.
     *
     * @param team to save
     * @return request message and HTTP status code
     */
    @PostMapping("/create/team")
    public ResponseEntity<String> createTeam(@RequestBody Team team) {
        try {
            teamRepository.save(team);
            return new ResponseEntity<>(team.getTeamName() + " is created", HttpStatus.CREATED);
        } catch (Exception e) {
            throw new TeamNotCreatedException("Wrong input while creating a new team. " + e.getMessage());
            //return new ResponseEntity<>("Something went wrong while creating a new team.\nError msg: " + e, HttpStatus.NOT_ACCEPTABLE);
        }
    }

    /**
     * Update a team, with an existing team.
     *
     * @param id   wanted to update
     * @param team object with updated data
     * @return request message and HTTP status code
     */
    @PutMapping("/update/team/{id}")
    public ResponseEntity<String> updateTeam(@PathVariable int id, @RequestBody Team team) {
        team.setTeamId(id); //set id to the one to edit
        Optional<Team> optionalTeam = teamRepository.findById(id);
        try {
            if (optionalTeam.isPresent()) {
                teamRepository.save(team);
                return new ResponseEntity<>("Updated " + team.getTeamName() + " by id: " + id, HttpStatus.ACCEPTED);
            }
            return new ResponseEntity<>("No team with id: " + id, HttpStatus.NOT_ACCEPTABLE);
        } catch (Exception e) {
            return new ResponseEntity<>("Update failed. no one with id: " + id + "\nError code: " + e, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Delete a team, with a given id.
     *
     * @param id of team to delete
     * @return request message and HTTP status code
     */
    @DeleteMapping("/delete/team/{id}")
    public ResponseEntity<String> deleteTeam(@PathVariable int id) {
        try {
            teamRepository.deleteById(id);
            return new ResponseEntity<>("deleted team with id: " + id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(
                    "can't delete team with id: " + id + "\nError code: " + e, HttpStatus.NOT_FOUND);
        }
    }

}
