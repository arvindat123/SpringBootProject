package com.springboot.project.repository;

import com.springboot.project.dto.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRespository extends JpaRepository<Country, Long> {

}
