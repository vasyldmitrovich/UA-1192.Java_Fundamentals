package com.softserve.edu07_oop2.hw.hw2;

public class Plane extends Passengers implements FlyingVehicle {
    private int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        // Implement logic for flying
    }

    @Override
    public void land() {
        // Implement logic for landing
    }
}



