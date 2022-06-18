package com.example.tourdkbackend.Repository;

import com.example.tourdkbackend.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {}
