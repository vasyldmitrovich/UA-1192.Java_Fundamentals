package com.softserve.edu07.hw.hw2;

public class Car extends GroundVehicle {
    String model;
    int passengers;


    public Car(String model, int passengers) {
        this.setPassengers(passengers);
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
            System.out.println("Car is busy at tha moment");
    }

    @Override
    public void info() {

        System.out.println("Type: " + getClass().getSimpleName() + "\nModel: " + getModel() +
                "Passengers: " + getPassengers());
        drive();
        System.out.println("-------------------");
    }
}
