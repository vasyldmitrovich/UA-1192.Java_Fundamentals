package com.softserve.edu07.hw.vehicle;

public class Car extends GroundVehicle {

    private String model;

    public Car() {
        model = "Renault";
        passengers = 1;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("It's a car. Model - " + model);
        System.out.println("Start driving");
        System.out.println("Driving...");
        System.out.println("Car's stopped by police");
    }
}
