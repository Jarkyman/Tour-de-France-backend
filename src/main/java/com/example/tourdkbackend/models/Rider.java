package com.example.tourdkbackend.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rider_id", nullable = false)
    private Integer riderId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private LocalDate birthday;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    @JsonManagedReference
    private Team team;

    @Column
    private int time;

    @Column
    private int points;

    @Column
    private int mountainPoints;

}
