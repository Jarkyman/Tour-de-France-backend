package com.example.tourdkbackend.config;

import com.example.tourdkbackend.models.Rider;
import com.example.tourdkbackend.models.Team;
import com.example.tourdkbackend.services.RiderRepository;
import com.example.tourdkbackend.services.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Random;

@Component
public class initTeamAndRiderData implements CommandLineRunner {

    @Autowired
    TeamRepository teamRepository;
    @Autowired
    RiderRepository riderRepository;

    /**
     * Data loaded on start
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

        //Teams

        Team team1 = new Team();
        team1.setTeamId(1);
        team1.setTeamName("AG2R Citroën Team");
        team1.setTeamCountry("France");
        teamRepository.save(team1);

        Team team2 = new Team();
        team2.setTeamId(2);
        team2.setTeamName("Team BikeExchange - Jayco");
        team2.setTeamCountry("New Zealand");
        teamRepository.save(team2);

        Team team3 = new Team();
        team3.setTeamId(3);
        team3.setTeamName("Movistar Team ");
        team3.setTeamCountry("Spain");
        teamRepository.save(team3);

        Team team4 = new Team();
        team4.setTeamId(4);
        team4.setTeamName("Team Arkéa Samsic");
        team4.setTeamCountry("France");
        teamRepository.save(team4);

        Team team5 = new Team();
        team5.setTeamId(5);
        team5.setTeamName("Intermarché - Wanty - Gobert Matériaux");
        team5.setTeamCountry("Belgium");
        teamRepository.save(team5);

        Team team6 = new Team();
        team6.setTeamId(6);
        team6.setTeamName("Groupama - FDJ");
        team6.setTeamCountry("France");
        teamRepository.save(team6);

        Team team7 = new Team();
        team7.setTeamId(7);
        team7.setTeamName("TotalEnergies");
        team7.setTeamCountry("France");
        teamRepository.save(team7);

        Team team8 = new Team();
        team8.setTeamId(8);
        team8.setTeamName("Team DSM");
        team8.setTeamCountry("Netherlands");
        teamRepository.save(team8);

        Team team9 = new Team();
        team9.setTeamId(9);
        team9.setTeamName("Alpecin-Deceuninck");
        team9.setTeamCountry("Belgium");
        teamRepository.save(team9);

        Team team10 = new Team();
        team10.setTeamId(10);
        team10.setTeamName("Trek - Segafredo");
        team10.setTeamCountry("United States");
        teamRepository.save(team10);

        Team team11 = new Team();
        team11.setTeamId(11);
        team11.setTeamName("BORA - hansgrohe");
        team11.setTeamCountry("Germany");
        teamRepository.save(team11);

        Team team12 = new Team();
        team12.setTeamId(12);
        team12.setTeamName("Israel - Premier Tech");
        team12.setTeamCountry("Isreal");
        teamRepository.save(team12);


        //Random number

        int time = new Random().nextInt(500) + 50;
        int points = new Random().nextInt(180) + 20;
        int mountainPoints = new Random().nextInt(140) + 14;

        // Riders
        Rider rider1 = new Rider();
        rider1.setFirstName("Edvald");
        rider1.setLastName("Oasson Hagen");
        rider1.setCountry("Norway");
        rider1.setBirthday(LocalDate.of(1987, 5, 17));
        rider1.setTeam(team7);
        rider1.setTime(new Random().nextInt(1200) + 50);
        rider1.setPoints(new Random().nextInt(280) + 20);
        rider1.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider1);

        Rider rider2 = new Rider();
        rider2.setFirstName("Maciej");
        rider2.setLastName("Bodnar");
        rider2.setCountry("Poland");
        rider2.setBirthday(LocalDate.of(1985, 12, 17));
        rider2.setTeam(team7);
        rider2.setTime(new Random().nextInt(1200) + 50);
        rider2.setPoints(new Random().nextInt(280) + 20);
        rider2.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider2);

        Rider rider3 = new Rider();
        rider3.setFirstName("Niccolò");
        rider3.setLastName("Bonifazio");
        rider3.setCountry("Italy");
        rider3.setBirthday(LocalDate.of(1997, 2, 13));
        rider3.setTeam(team7);
        rider3.setTime(new Random().nextInt(1200) + 50);
        rider3.setPoints(new Random().nextInt(280) + 20);
        rider3.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider3);

        Rider rider4 = new Rider();
        rider4.setFirstName("Mathieu");
        rider4.setLastName("Burgaudeau");
        rider4.setCountry("Franch");
        rider4.setBirthday(LocalDate.of(1980, 8, 24));
        rider4.setTeam(team7);
        rider4.setTime(new Random().nextInt(1200) + 50);
        rider4.setPoints(new Random().nextInt(280) + 20);
        rider4.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider4);

        Rider rider5 = new Rider();
        rider5.setFirstName("Jérémy");
        rider5.setLastName("Cabot");
        rider5.setCountry("Franch");
        rider5.setBirthday(LocalDate.of(1999, 10, 10));
        rider5.setTeam(team7);
        rider5.setTime(new Random().nextInt(1200) + 50);
        rider5.setPoints(new Random().nextInt(280) + 20);
        rider5.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider5);

        Rider rider6 = new Rider();
        rider6.setFirstName("Thymen");
        rider6.setLastName("Arensman");
        rider6.setCountry("Netherlands");
        rider6.setBirthday(LocalDate.of(1987, 6, 19));
        rider6.setTeam(team8);
        rider6.setTime(new Random().nextInt(1200) + 50);
        rider6.setPoints(new Random().nextInt(280) + 20);
        rider6.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider6);

        Rider rider7 = new Rider();
        rider7.setFirstName("Nikias");
        rider7.setLastName("Arndt");
        rider7.setCountry("Germany");
        rider7.setBirthday(LocalDate.of(1989, 3, 5));
        rider7.setTeam(team8);
        rider7.setTime(new Random().nextInt(1200) + 50);
        rider7.setPoints(new Random().nextInt(280) + 20);
        rider7.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider7);

        Rider rider8 = new Rider();
        rider8.setFirstName("Jonas");
        rider8.setLastName("Iversby Hvideberg");
        rider8.setCountry("Denmark");
        rider8.setBirthday(LocalDate.of(1998, 5, 17));
        rider8.setTeam(team8);
        rider8.setTime(new Random().nextInt(1200) + 50);
        rider8.setPoints(new Random().nextInt(280) + 20);
        rider8.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider8);

        Rider rider9 = new Rider();
        rider9.setFirstName("Mark");
        rider9.setLastName("Donovan");
        rider9.setCountry("Grate Britain");
        rider9.setBirthday(LocalDate.of(1987, 9, 22));
        rider9.setTeam(team8);
        rider9.setTime(new Random().nextInt(1200) + 50);
        rider9.setPoints(new Random().nextInt(280) + 20);
        rider9.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider9);

        Rider rider10 = new Rider();
        rider10.setFirstName("Cees");
        rider10.setLastName("Bol");
        rider10.setCountry("Netherlands");
        rider10.setBirthday(LocalDate.of(1992, 9, 12));
        rider10.setTeam(team8);
        rider10.setTime(new Random().nextInt(1200) + 50);
        rider10.setPoints(new Random().nextInt(280) + 20);
        rider10.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider10);

        Rider rider11 = new Rider();
        rider11.setFirstName("Edward");
        rider11.setLastName("Anderson");
        rider11.setCountry("United States");
        rider11.setBirthday(LocalDate.of(1987, 5, 17));
        rider11.setTeam(team9);
        rider11.setTime(new Random().nextInt(1200) + 50);
        rider11.setPoints(new Random().nextInt(280) + 20);
        rider11.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider11);

        Rider rider12 = new Rider();
        rider12.setFirstName("Maurice");
        rider12.setLastName("Ballerstedt");
        rider12.setCountry("Germany");
        rider12.setBirthday(LocalDate.of(1990, 9, 12));
        rider12.setTeam(team9);
        rider12.setTime(new Random().nextInt(1200) + 50);
        rider12.setPoints(new Random().nextInt(280) + 20);
        rider12.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider12);

        Rider rider13 = new Rider();
        rider13.setFirstName("Sjoerd");
        rider13.setLastName("Bax");
        rider13.setCountry("Netherlands");
        rider13.setBirthday(LocalDate.of(1999, 5, 22));
        rider13.setTeam(team9);
        rider13.setTime(new Random().nextInt(1200) + 50);
        rider13.setPoints(new Random().nextInt(280) + 20);
        rider13.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider13);

        Rider rider14 = new Rider();
        rider14.setFirstName("Tobias");
        rider14.setLastName("Bayer");
        rider14.setCountry("Austria");
        rider14.setBirthday(LocalDate.of(1997, 4, 8));
        rider14.setTeam(team9);
        rider14.setTime(new Random().nextInt(1200) + 50);
        rider14.setPoints(new Random().nextInt(280) + 20);
        rider14.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider14);

        Rider rider15 = new Rider();
        rider15.setFirstName("Dries");
        rider15.setLastName("De Bondt");
        rider15.setCountry("Belgium");
        rider15.setBirthday(LocalDate.of(1996, 12, 20));
        rider15.setTeam(team9);
        rider15.setTime(new Random().nextInt(1200) + 50);
        rider15.setPoints(new Random().nextInt(280) + 20);
        rider15.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider15);

        Rider rider16 = new Rider();
        rider16.setFirstName("Jon");
        rider16.setLastName("Aberasturi");
        rider16.setCountry("Spain");
        rider16.setBirthday(LocalDate.of(1987, 5, 17));
        rider16.setTeam(team10);
        rider16.setTime(new Random().nextInt(1200) + 50);
        rider16.setPoints(new Random().nextInt(280) + 20);
        rider16.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider16);

        Rider rider17 = new Rider();
        rider17.setFirstName("Filippo");
        rider17.setLastName("Baroncini");
        rider17.setCountry("Italy");
        rider17.setBirthday(LocalDate.of(1992, 6, 14));
        rider17.setTeam(team10);
        rider17.setTime(new Random().nextInt(1200) + 50);
        rider17.setPoints(new Random().nextInt(280) + 20);
        rider17.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider17);

        Rider rider18 = new Rider();
        rider18.setFirstName("Alexander");
        rider18.setLastName("Kamp");
        rider18.setCountry("Denmark");
        rider18.setBirthday(LocalDate.of(2002, 2, 3));
        rider18.setTeam(team10);
        rider18.setTime(new Random().nextInt(1200) + 50);
        rider18.setPoints(new Random().nextInt(280) + 20);
        rider18.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider18);

        Rider rider19 = new Rider();
        rider19.setFirstName("Marc");
        rider19.setLastName("Brustenga");
        rider19.setCountry("Spain");
        rider19.setBirthday(LocalDate.of(1988, 8, 18));
        rider19.setTeam(team10);
        rider19.setTime(new Random().nextInt(1200) + 50);
        rider19.setPoints(new Random().nextInt(280) + 20);
        rider19.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider19);

        Rider rider20 = new Rider();
        rider20.setFirstName("Otto");
        rider20.setLastName("Vergaerde");
        rider20.setCountry("Belgium");
        rider20.setBirthday(LocalDate.of(1985, 3, 17));
        rider20.setTeam(team10);
        rider20.setTime(new Random().nextInt(1200) + 50);
        rider20.setPoints(new Random().nextInt(280) + 20);
        rider20.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider20);

        /*
        Rider rider = new Rider();
        rider.setFirstName(navn);
        rider.setLastName(efternavn);
        rider.setCountry(land);
        rider.setBirthday(LocalDate.of(1987, 5, 17));
        rider.setTeam(team10);
        rider.setTime(new Random().nextInt(1200) + 50);
        rider.setPoints(new Random().nextInt(280) + 20);
        rider.setMountainPoints(new Random().nextInt(240) + 20);
        riderRepository.save(rider);
         */

    }
}
