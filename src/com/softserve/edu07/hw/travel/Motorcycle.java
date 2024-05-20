package com.softserve.edu07.hw.travel;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle() {
        setPassengers(2);
        System.out.println("Motorcycle is created. Number of passengers: " + getPassengers());
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is drive");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
