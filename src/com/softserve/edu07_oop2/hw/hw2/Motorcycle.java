package com.softserve.edu07_oop2.hw.hw2;

public class Motorcycle extends Passengers implements GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        // Implement logic for driving
    }
}


