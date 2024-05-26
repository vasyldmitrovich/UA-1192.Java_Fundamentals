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
        if (getPassengers() <= 0) {
            System.out.println("The car is on parkingspace");
        } else System.out.println("The car is riding");
    }

    @Override
    public void info() {
        String gap = "\n";
        System.out.println("-".repeat(40) + gap + "Type: " + getClass().getSimpleName() + gap + "Model: " + getModel() + gap +
                "Passengers: " + getPassengers() + gap);
        drive();
        System.out.println(gap + "-".repeat(40));
    }
}
