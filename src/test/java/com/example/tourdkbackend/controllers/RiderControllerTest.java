package com.example.tourdkbackend.controllers;

import com.example.tourdkbackend.models.Rider;
import com.example.tourdkbackend.models.Team;
import com.example.tourdkbackend.services.RiderRepository;
import com.example.tourdkbackend.services.TeamRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
class RiderControllerTest {

    @Autowired
    private RiderRepository riderRepository;
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private RiderController riderController;

    @BeforeTestMethod
    public void beforeTest() {
        riderRepository.deleteAll();
        teamRepository.deleteAll();
    }

    @Test
    public void createRider() {
        Team team = new Team();
        team.setTeamName("Team 1");
        team.setTeamCountry("Denmark");
        teamRepository.save(team);

        Rider rider = new Rider();
        rider.setFirstName("Test Name");
        rider.setLastName("Test Lastname");
        rider.setCountry("Denmark");
        rider.setTeam(team);
        rider.setBirthday(LocalDate.of(1990, 4, 8));
        rider.setMountainPoints(0);
        rider.setPoints(0);
        rider.setMountainPoints(0);
        rider.setTime(0);

        ResponseEntity<String> response = riderController.createRider(rider);

        Optional<Rider> getRider = riderRepository.findById(rider.getRiderId());

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertThat(getRider.isPresent()).isTrue();
    }

    @Test
    void updateRider() {
        Team team = new Team();
        team.setTeamName("Team 1");
        team.setTeamCountry("Denmark");
        teamRepository.save(team);

        Rider rider = new Rider();
        rider.setFirstName("Test Name");
        rider.setLastName("Test Lastname");
        rider.setCountry("Denmark");
        rider.setTeam(team);
        rider.setBirthday(LocalDate.of(1990, 4, 8));
        rider.setMountainPoints(0);
        rider.setPoints(0);
        rider.setMountainPoints(0);
        rider.setTime(0);
        riderRepository.save(rider);

        int id = rider.getRiderId();

        Rider newRider = new Rider();
        newRider.setFirstName("Test Name updated");
        newRider.setLastName("Test Lastname");
        newRider.setCountry("Denmark");
        newRider.setTeam(team);
        newRider.setBirthday(LocalDate.of(1990, 4, 8));
        newRider.setMountainPoints(0);
        newRider.setPoints(0);
        newRider.setMountainPoints(0);
        newRider.setTime(0);

        ResponseEntity<String> response = riderController.updateRider(id, newRider);

        Optional<Rider> getRider = riderRepository.findById(id);

        assertEquals(HttpStatus.ACCEPTED, response.getStatusCode());
        assertThat(getRider.isPresent()).isTrue();
        assertEquals("Test Name updated", getRider.get().getFirstName());
    }

    @Test
    void deleteRider() {
        Team team = new Team();
        team.setTeamId(1);
        team.setTeamName("Team 1");
        team.setTeamCountry("Denmark");
        teamRepository.save(team);

        Rider rider = new Rider();
        rider.setFirstName("Test Name");
        rider.setLastName("Test Lastname");
        rider.setCountry("Denmark");
        rider.setTeam(team);
        rider.setBirthday(LocalDate.of(1990, 4, 8));
        rider.setMountainPoints(0);
        rider.setPoints(0);
        rider.setMountainPoints(0);
        rider.setTime(0);
        riderRepository.save(rider);

        int id = rider.getRiderId();

        ResponseEntity<String> response = riderController.deleteRider(id);

        Optional<Rider> getRider = riderRepository.findById(id);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertThat(getRider.isPresent()).isFalse();
    }
}