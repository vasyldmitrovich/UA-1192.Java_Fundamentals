package com.softserve.edu07_oop2.hw;

public class Plane extends FlyingVechicle{

    private int maxDistance;

    public Plane() {
    }

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {

    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistance=" + maxDistance +
                '}';
    }

    @Override
    void land() {

    }
}
