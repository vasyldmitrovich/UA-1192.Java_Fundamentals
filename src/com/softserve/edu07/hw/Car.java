package com.softserve.edu07.hw;

public class Car extends GroundVehicle {

    private String model;

    public Car() {
        this.model = "";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("car drive");
    }
}
