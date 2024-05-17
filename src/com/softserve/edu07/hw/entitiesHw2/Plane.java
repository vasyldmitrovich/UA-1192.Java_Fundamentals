package com.softserve.edu07.hw.entitiesHw2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passengers,int maxDistance) {
        super(passengers);
        this.maxDistance=maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("I can fly at a distance "+maxDistance +" with "+getPassengers()+" passengers");
    }

    @Override
    void land() {
        System.out.println("I land smoothly like an airplane");
    }
}
