package com.softserve.edu07_oop2.hw.hw2;

public class Car extends Passengers implements GroundVehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        // Implement logic for driving
    }
}



