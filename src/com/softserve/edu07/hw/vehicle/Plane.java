package com.softserve.edu07.hw.vehicle;

public class Plane extends FlyingVehicle {

    private int maxDistance;

    public Plane() {
        maxDistance = RAND.nextInt(1000);
        passengers = 450;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Plane starts flying...");
        System.out.println("Selected distance: " + RAND.nextInt(maxDistance));
        System.out.println("Plane ends flying...");
        land();
    }

    @Override
    public void land() {
        System.out.println("Plane's landing...");
    }
}
