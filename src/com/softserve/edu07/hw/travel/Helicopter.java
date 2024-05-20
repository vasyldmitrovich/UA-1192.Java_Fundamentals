package com.softserve.edu07.hw.travel;

public class Helicopter extends FlyingVehicle {
    private int weight, maxHeight;

    public Helicopter() {
        setPassengers(8);
        System.out.println("Helicopter is created. Number of passengers: " + getPassengers());
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public void land() {
        System.out.println("Helicopter is landing");
    }

}
