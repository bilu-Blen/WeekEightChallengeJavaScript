package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

    @Autowired
    CarRepository carRepository;

    @CrossOrigin
    @RequestMapping("/")
    public Iterable<Car> getAllCars(){
        return carRepository.findAll();
    }

    @CrossOrigin
    @RequestMapping("/addcar")
    public String addCar(@RequestBody Car car){
        System.out.println(car.getModel());
        carRepository.save(car);
        return "A car was added.";
    }

    @CrossOrigin
    @RequestMapping("/deletecar")
    public String deleteCar(@RequestBody Car car){
        System.out.println(car.getModel());
        

        carRepository.delete(car);
        return "A car was deleted.";
    }



}
