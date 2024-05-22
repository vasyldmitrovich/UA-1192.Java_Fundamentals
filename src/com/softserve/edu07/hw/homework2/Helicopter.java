package com.softserve.edu07.hw.homework2;

public class Helicopter extends FlyingVehicle{

    private int weight;
    private int maxHeight;

    public Helicopter () {
        this.passengers = 4;
        this.weight = 1600;
        this.maxHeight = 3500;
    }

    public Helicopter (int passengers, int weight, int maxHeight) {
        this.passengers = passengers;
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
        System.out.println("The helicopter takes off");
    }

    @Override
    public void land() {
        System.out.println("The helicopter lands");
    }
}
