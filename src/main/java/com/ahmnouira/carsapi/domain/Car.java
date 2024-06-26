package com.ahmnouira.carsapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String brand, model, color, registerNumber;

    private int year, price;

    public Car() {
    }

    public long getId() {
        return id;
    }
}
