package com.softserve.edu06.pt.PracticalTask1;

public abstract class Car {

    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public void run() {
        System.out.println("The car started to run ");
    }

    public void stop() {
        System.out.println("The car stopped");
    }
}
