package com.example.CountryWebService.Controller;

import com.example.CountryWebService.Model.Country;
import com.example.CountryWebService.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping
    public List<Country> findAll(){
        return countryService.getCountries();
    }

    @GetMapping("/{id}")
    public Country findOne(@PathVariable int id){
        return countryService.getCountry(id);
    }
}
