package com.example.tourdkbackend.controllers;

import com.example.tourdkbackend.models.Rider;
import com.example.tourdkbackend.models.Team;
import com.example.tourdkbackend.services.RiderRepository;
import com.example.tourdkbackend.services.TeamRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
class TeamControllerTest {

    @Autowired
    private RiderRepository riderRepository;
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private TeamController teamController;

    @BeforeTestMethod
    public void beforeTest() {
        riderRepository.deleteAll();
        teamRepository.deleteAll();
    }

    @Test
    void getRidersFromTeam() {
        createData();

        int id = 1;
        List<Rider> riders = teamController.getRidersFromTeam(id);

        List<Rider> allRiders = riderRepository.findAll();
        List<Rider> expectedRiders = new ArrayList<>();
        for (Rider rider : allRiders) {
            if (rider.getTeam().getTeamId() == id) {
                expectedRiders.add(rider);
            }
        }

        assertThat(riders.isEmpty()).isFalse();
        assertThat(expectedRiders.size()).isEqualTo(riders.size());
    }

    private void createData() {
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

        team.setTeamName("Team 2");
        team.setTeamCountry("Denmark");
        teamRepository.save(team);

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
    }

}