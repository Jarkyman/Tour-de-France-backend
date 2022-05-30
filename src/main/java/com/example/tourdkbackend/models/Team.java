package com.example.tourdkbackend.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "team_id", nullable = false)
    private Integer teamId;

    @Column(nullable = false)
    private String teamName;

    @OneToMany
    @JoinColumn(name = "team_id")
    private Set<Rider> riders = new HashSet<>();
}
