package com.softserve.edu07.hw.hw2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int maxDistance, int passengers) {
        setPassengers(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        if (getPassengers() > 2) {
            System.out.println("The plane is in air now");
        }
    }

    @Override
    public void land() {
        if (getPassengers() <= 2) {
            System.out.println("The plane has landed in airport");
        }
    }

    @Override
    public void info() {
        String gap = "\n";
        System.out.println("-".repeat(40) + gap + "Type: " + getClass().getSimpleName() + gap + "Passengers: " + getPassengers() + gap +
                getMaxDistance() + gap);
        fly();
        land();
        System.out.println(gap + "-".repeat(40));
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
