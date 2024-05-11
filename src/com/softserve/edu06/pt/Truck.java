package com.softserve.edu06.pt;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck starts running");
        startRun();
        System.out.println("Truck's running by max speed");
    }

    @Override
    public void stop() {
        System.out.println("Man in truck is going to brake");
        stopRun();
        System.out.println("Truck was stopped");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model=" + getModel()
                + ", maxSpeed=" + getMaxSpeed()
                + ", yearOfProduction=" + getYearOfProduction()
                + "}";
    }
}
