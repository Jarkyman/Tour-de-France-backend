package com.example.tourdkbackend.Repository;

import com.example.tourdkbackend.models.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiderRepository extends JpaRepository<Rider, Integer> {

     List<Rider> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String firstName, String lastName);

     List<Rider> findAllByTeamTeamId(int id);

}
