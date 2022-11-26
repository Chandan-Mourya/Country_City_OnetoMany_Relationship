package com.masai.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.masai.Service.CityService;
import com.masai.model.City;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getCities(){
        return cityService.getCities();
    }
    @GetMapping("/{id}")
    public City getCity(@PathVariable int id){
        return cityService.getCity(id);
    }
    @PostMapping
    public City addCity(@RequestBody City city){
        return cityService.addCity(city);
    }
    @PutMapping("/{id}")
    public City addCity(@PathVariable int id,@RequestBody City city){
        return cityService.updateCity(id,city);
    }
    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable int id){
        cityService.deleteCity(id);
    }
}
