package com.softserve.edu07.hw.hw2;

public class Helicopter extends FlyingVehicle {
    int weight;
    int maxHeight;

    public Helicopter(int weight, int maxHeight, int passengers) {
        setPassengers(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getWeight() {
        return weight;
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
        System.out.println("Type: " + getClass().getSimpleName() + "\nPassengers: " + getPassengers() + "\nMax flight height: " + getMaxHeight() + "\nMax weight: " + getWeight());
        fly();
        land();
        System.out.println("-------------------");
    }
}
