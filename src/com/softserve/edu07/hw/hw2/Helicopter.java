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
        if (getPassengers() > 0) {
            System.out.println("The helicopter is in the air");
        }
    }

    @Override
    public void land() {
        if (getPassengers() <= 0) {
            System.out.println("The helicopter isn't in the air");
        }
    }

    @Override
    public void info() {
        String gap = "\n";
        System.out.println("-".repeat(40) + gap + "Type: " + getClass().getSimpleName() + gap + "Passengers: " + getPassengers() + gap +
                "Max flight height: " + getMaxHeight() + gap + "Max flight weight: " + getWeight() + gap);
        fly();
        land();
        System.out.println(gap + "-".repeat(40));
    }
}
