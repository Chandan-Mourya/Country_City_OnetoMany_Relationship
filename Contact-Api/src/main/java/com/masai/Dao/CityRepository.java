package com.masai.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.City;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
}
