package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "{vnum}", method= RequestMethod.DELETE)
    public String deleteCar(@PathVariable("vnum") String vnum, Car car){
        System.out.println(car.getModel());

        carRepository.delete(car);
        return "A car was deleted.";
    }



}
