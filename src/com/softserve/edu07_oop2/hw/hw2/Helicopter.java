package com.softserve.edu07_oop2.hw.hw2;

public class Helicopter extends Passengers implements FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        // Implement logic for flying
    }

    @Override
    public void land() {
        // Implement logic for landing
    }
}



