package com.softserve.edu07.hw.homework2;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public Plane () {
        this.passengers = 30;
        this.maxDistance = 6000;
    }

    public Plane (int passengers, int maxDistance) {
        this.passengers = passengers;
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
        System.out.println("The plane takes off");
    }

    @Override
    public void land() {
        System.out.println("The plane lands");
    }
}
