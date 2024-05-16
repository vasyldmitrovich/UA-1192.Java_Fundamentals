package com.softserve.edu07.hw;

class Plane extends FlyingVehicle {

    private int maxDistance;

    public Plane() {
        this.maxDistance = 1000;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    void land() {
        System.out.println("Plane is landing");
    }
}
