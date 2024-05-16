package com.softserve.edu07.hw.vehicle;

public class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public Motorcycle() {
        maxSpeed = RAND.nextInt(100) + 150;
        passengers = 1;
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
        System.out.println("Gradually increasing speed");
        System.out.println("Maintaining max speed: " + maxSpeed);
        System.out.println("Decreasing speed");
        System.out.println("Stop");
    }
}
