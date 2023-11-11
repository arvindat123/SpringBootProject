package com.springboot.project.service;

import com.springboot.project.dto.Country;
import com.springboot.project.repository.CountryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GetCountryImplementation implements GetCountry {

    @Autowired
    CountryRespository countryRespository;

    public List<Country> getListOfCountries(){
       return countryRespository.findAll();
    }

}
