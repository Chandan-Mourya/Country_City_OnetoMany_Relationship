package com.masai.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {

}
