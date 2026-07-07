package com.example.CountryWebService.Service;

import com.example.CountryWebService.Model.Country;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CountryService {
    List<Country> countries = Arrays.asList(new Country("IN","India",101),
            new Country("JPN","Japan",102),
            new Country("AUS","Australia",103),
            new Country("USA","United States of America",104)
    );

    public List<Country> getCountries(){
        return countries;
    }

    public Country getCountry(int id){
        return countries.stream()
                .filter(country -> country.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
