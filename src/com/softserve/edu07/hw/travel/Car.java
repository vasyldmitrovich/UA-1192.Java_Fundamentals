package com.softserve.edu07.hw.travel;

public class Car extends GroundVehicle {
    private String model;

    public Car() {
        setPassengers(5);
        System.out.println("Car is created.Number of passengers: " + getPassengers());

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
   public void drive() {
        System.out.println("Car is drive");
    }
}
