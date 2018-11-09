package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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
    @DeleteMapping("/deletecar")
    public String deleteCar(HttpServletRequest r){
        System.out.println("Entered the delete car method");
        String vnum = r.getParameter("vnum");
        Car theCar = carRepository.findByVnumEqualsIgnoreCase(vnum);
        System.out.println(theCar.getModel());
        carRepository.delete(theCar);
        return "A car was deleted.";
    }





}
