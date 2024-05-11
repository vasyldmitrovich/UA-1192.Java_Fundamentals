package com.softserve.edu06.pt;

public class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan starts running");
        startRun();
        System.out.println("Sedan's running by max speed");
    }

    @Override
    public void stop() {
        System.out.println("Man in sedan is going to brake");
        stopRun();
        System.out.println("Sedan was stopped");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model=" + getModel()
                + ", maxSpeed=" + getMaxSpeed()
                + ", yearOfProduction=" + getYearOfProduction()
                + "}";
    }
}
