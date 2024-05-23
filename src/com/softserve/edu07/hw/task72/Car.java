package com.softserve.edu07.hw.task72;

public class Car extends GroundVehicle{
    private String model;

    public Car(){}

    @Override
    public void drive() {
        System.out.println("The car is going");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
