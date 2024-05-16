package com.softserve.edu07.hw;

class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public Motorcycle() {
        this.maxSpeed = 0;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle drive");
    }
}
