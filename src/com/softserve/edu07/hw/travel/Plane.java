package com.softserve.edu07.hw.travel;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {
        setPassengers(150);
        System.out.println("Plane is created. Number of passengers: " + getPassengers());
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
