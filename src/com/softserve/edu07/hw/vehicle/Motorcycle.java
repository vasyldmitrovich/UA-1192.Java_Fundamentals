package com.softserve.edu07.hw.vehicle;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passenger, int maxSpeed) {
        super(passenger);
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
        System.out.println("Motorcycle is moves at " + getMaxSpeed() + " kilometers per hour! There is " + getPassenger() + " passenger!");
    }
}
