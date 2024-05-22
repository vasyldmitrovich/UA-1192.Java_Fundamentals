package com.softserve.edu06.pt.auto;

public abstract class Car {

    private String model;
    private int maxSpeed, yearOfProduction;


    private static void run() {
    }

    private static void stop() {
    }

    protected Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return model + " have maxSpeed: " + maxSpeed + " and year of production is: " + yearOfProduction + ";";
    }
}
