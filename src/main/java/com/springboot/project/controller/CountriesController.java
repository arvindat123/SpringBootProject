package com.springboot.project.controller;


import com.springboot.project.dto.Country;
import com.springboot.project.service.GetCountry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountriesController {

    private static final Logger logger = LogManager.getLogger(CountriesController.class);

    @Autowired
    GetCountry getCountryList;

    @GetMapping("/get")
    public List<Country> getListOfCountries(){
        logger.info("info Inside getListOfCountries method of CountriesController class");
        logger.trace("trace Inside getListOfCountries method of CountriesController class");
        return getCountryList.getListOfCountries();
    }
}
