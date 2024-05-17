package com.softserve.edu07.hw.vehicle;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passenger, int maxDistance) {
        super(passenger);
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
        System.out.println("Plane is flying now, it can fly " + getMaxDistance() + " kilometers");
    }

    @Override
    public void land() {
        System.out.println("Plane successfully landed, there are " + getPassenger() + " passengers!");
    }
}
