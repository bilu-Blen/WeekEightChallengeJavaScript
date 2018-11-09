package com.example.demo;

import javax.persistence.Id;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Car {
    @GeneratedValue
    @Id
    private long id;
    private String vnum;


    private String make;
    private String model;
    private String year;


    public Car() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVnum() {
        return vnum;
    }

    public void setVnum(String vnum) {
        this.vnum = vnum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
