package com.example.tourdkbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Team model class, holding information about a team.
 */

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id", nullable = false)
    private Integer teamId;

    @Column(nullable = false)
    private String teamName;

    @Column(nullable = false)
    private String teamCountry;

    @OneToMany
    @JoinColumn(name = "team_id")
    @JsonBackReference
    private Set<Rider> riders = new HashSet<>();

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCountry() {
        return teamCountry;
    }

    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }

    public Set<Rider> getRiders() {
        return riders;
    }

    public void setRiders(Set<Rider> riders) {
        this.riders = riders;
    }
}
