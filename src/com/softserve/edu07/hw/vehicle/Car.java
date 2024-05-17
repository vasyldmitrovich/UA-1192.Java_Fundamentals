package com.softserve.edu07.hw.vehicle;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passenger, String model) {
        super(passenger);
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
        System.out.println(getModel() + " moves with " + getPassenger() + " passengers inside!");
    }
}
