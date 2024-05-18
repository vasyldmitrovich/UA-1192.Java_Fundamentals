package com.softserve.edu06.ptask;

public class Sedan extends Car {

    public Sedan(String model, double maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan is running.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan has stopped.");
    }
}
