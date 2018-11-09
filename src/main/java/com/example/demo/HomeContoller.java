package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

    @Autowired
    CarRepository carRepository;

    @RequestMapping("/")
    public Iterable<Car> getAllCars(){
        return carRepository.findAll();
    }


}
