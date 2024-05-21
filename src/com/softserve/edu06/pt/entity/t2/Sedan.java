package com.softserve.edu06.pt.entity.t2;

public class Sedan extends Car {
    public Sedan(String model, float maxSpeed, String yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    public Sedan() {
    }

    @Override
    public void run() {
        System.out.println("The Sedan is running.");
    }

    @Override
    public void stop() {
        System.out.println("The Sedan has stopped.");
    }
}
