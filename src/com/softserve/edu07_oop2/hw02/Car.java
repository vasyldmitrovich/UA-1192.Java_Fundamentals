package com.softserve.edu07_oop2.hw02;

public class Car extends GroundVehicle {
    private String model;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {

    }
}
