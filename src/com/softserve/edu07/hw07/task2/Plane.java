package com.softserve.edu07.hw07.task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {
        this.maxDistance = 0;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
