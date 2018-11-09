package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository  carRepository;

    @Override
    public void run(String... strings) throws Exception{
        //creating  anew car
        Car car = new Car();
        car.setModel("Toyota");
        car.setMake("Camery");
        car.setVnum("M12345");
        car.setYear("2010");

        carRepository.save(car);
    }
}