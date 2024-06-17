package com.softserve.edu07.hw.hw2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int maxDistance, int passengers) {
        setPassengers(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Lets fly");
    }

    @Override
    public void land() {
        System.out.println("Go down, Moses");
    }

    @Override
    public void info() {
        System.out.println("Type: " + getClass().getSimpleName() + "\nPassengers: " + getPassengers() + "\n" +
                getMaxDistance());
        fly();
        land();
        System.out.println("-------------------");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
