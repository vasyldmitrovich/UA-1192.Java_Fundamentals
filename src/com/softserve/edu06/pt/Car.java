package com.softserve.edu06.pt;

public abstract class Car {// This is nice

    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public abstract void run();

    public abstract void stop();

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    protected void startRun() {
        System.out.println("0 km/h");
        System.out.printf("%d km/h%n", maxSpeed / 2);
        System.out.printf("%d km/h%n", maxSpeed);
    }

    protected void stopRun() {
        System.out.printf("%d km/h%n", maxSpeed);
        System.out.printf("%d km/h%n", maxSpeed / 2);
        System.out.println("0 km/h");
    }
}
