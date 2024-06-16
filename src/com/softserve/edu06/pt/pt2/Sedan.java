package com.softserve.edu06.pt.pt2;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    public Sedan() {
        super();

    }

    @Override
    public void run() {
        System.out.println("The Sedan is running.");

    }

    public void stop() {
        System.out.println("The Sedan is stopped.");

    }

}
