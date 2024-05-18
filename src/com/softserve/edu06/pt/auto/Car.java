package com.softserve.edu06.pt.auto;

public abstract class Car {

    private final String MODEL;
    private final int MAX_SPEED, YEAR_OF_PRODUCTION;


    private static void run() {
    }

    private static void stop() {
    }

    protected Car(String model, int maxSpeed, int yearOfProduction) {
        this.MODEL = model;
        this.MAX_SPEED = maxSpeed;
        this.YEAR_OF_PRODUCTION = yearOfProduction;
    }

    @Override
    public String toString() {
        return MODEL + " have maxSpeed: " + MAX_SPEED + " and year of production is: " + YEAR_OF_PRODUCTION + ";";
    }
}
