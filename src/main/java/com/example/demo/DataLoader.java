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

        Car car1 = new Car();
        car1.setModel("116i766");
        car1.setMake("Fiat 1500");
        car1.setVnum("M123475");
        car1.setYear("2018");

        carRepository.save(car1);
    }
}