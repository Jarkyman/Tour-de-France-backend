package com.example.tourdkbackend.config;

import com.example.tourdkbackend.models.Country;
import com.example.tourdkbackend.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class initCountryData implements CommandLineRunner {

    @Autowired
    CountryRepository countryRepository;

    /**
     * Loads all countries to database
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        Country country1 = new Country();
        country1.setCountryId(1);
        country1.setCountry("France");
        countryRepository.save(country1);
        Country country2 = new Country();
        country2.setCountryId(2);
        country2.setCountry("Belgium");
        countryRepository.save(country2);
        Country country3 = new Country();
        country3.setCountryId(3);
        country3.setCountry("Spain");
        countryRepository.save(country3);
        Country country4 = new Country();
        country4.setCountryId(4);
        country4.setCountry("Italy");
        countryRepository.save(country4);
        Country country5 = new Country();
        country5.setCountryId(5);
        country5.setCountry("Germany");
        countryRepository.save(country5);
        Country country6 = new Country();
        country6.setCountryId(6);
        country6.setCountry("Colombia");
        countryRepository.save(country6);
        Country country7 = new Country();
        country7.setCountryId(7);
        country7.setCountry("Denmark");
        countryRepository.save(country7);
        Country country8 = new Country();
        country8.setCountryId(8);
        country8.setCountry("Netherlands");
        countryRepository.save(country8);
        Country country9 = new Country();
        country9.setCountryId(9);
        country9.setCountry("Austria");
        countryRepository.save(country9);
        Country country10 = new Country();
        country10.setCountryId(10);
        country10.setCountry("Slovenia");
        countryRepository.save(country10);
        Country country11 = new Country();
        country11.setCountryId(11);
        country11.setCountry("Great Britain");
        countryRepository.save(country11);
        Country country12 = new Country();
        country12.setCountryId(12);
        country12.setCountry("Norway");
        countryRepository.save(country12);
        Country country13 = new Country();
        country13.setCountryId(13);
        country13.setCountry("Switzerland");
        countryRepository.save(country13);
        Country country14 = new Country();
        country14.setCountryId(14);
        country14.setCountry("Ireland");
        countryRepository.save(country14);
        Country country15 = new Country();
        country15.setCountryId(15);
        country15.setCountry("New Zealand");
        countryRepository.save(country15);
        Country country16 = new Country();
        country16.setCountryId(16);
        country16.setCountry("United States");
        countryRepository.save(country16);
        Country country17 = new Country();
        country17.setCountryId(17);
        country17.setCountry("Australia");
        countryRepository.save(country17);
        Country country18 = new Country();
        country18.setCountryId(18);
        country18.setCountry("Czech Republic");
        countryRepository.save(country18);
        Country country19 = new Country();
        country19.setCountryId(19);
        country19.setCountry("Latvia");
        countryRepository.save(country19);
        Country country20 = new Country();
        country20.setCountryId(20);
        country20.setCountry("South Africa");
        countryRepository.save(country20);
        Country country21 = new Country();
        country21.setCountryId(21);
        country21.setCountry("Canada");
        countryRepository.save(country21);
        Country country22 = new Country();
        country22.setCountryId(22);
        country22.setCountry("Costa Rica");
        countryRepository.save(country22);
        Country country23 = new Country();
        country23.setCountryId(23);
        country23.setCountry("Ecuador");
        countryRepository.save(country23);
        Country country24 = new Country();
        country24.setCountryId(24);
        country24.setCountry("Isreal");
        countryRepository.save(country24);
        Country country25 = new Country();
        country25.setCountryId(25);
        country25.setCountry("Kazakhstan");
        countryRepository.save(country25);
        Country country26 = new Country();
        country26.setCountryId(26);
        country26.setCountry("Luxembourg");
        countryRepository.save(country26);
        Country country27 = new Country();
        country27.setCountryId(27);
        country27.setCountry("Poland");
        countryRepository.save(country27);
        Country country28 = new Country();
        country28.setCountryId(28);
        country28.setCountry("Portugal");
        countryRepository.save(country28);
        Country country29 = new Country();
        country29.setCountryId(29);
        country29.setCountry("Slovakia");
        countryRepository.save(country29);
    }
}
