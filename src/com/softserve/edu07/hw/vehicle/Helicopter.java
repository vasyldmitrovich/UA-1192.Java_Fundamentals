package com.softserve.edu07.hw.vehicle;

import java.sql.SQLOutput;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int Height;

    public Helicopter(int passenger, int weight, int height) {
        super(passenger);
        this.weight = weight;
        Height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying now with " + getHeight() + " km of height and " + getWeight() + " kg of weight!");
    }

    @Override
    public void land() {
        System.out.println("Helicopter successfully landed! There are " + getPassenger() + " passengers!");
    }
}
