package com.softserve.edu07_oop2.hw;

public class Helicopter extends FlyingVechicle{

    private int weight;
    private int maxHeight;

    public Helicopter() {
    }

    public Helicopter(int maxHeight, int weight) {
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

    public Helicopter(int passengers, int maxHeight, int weight) {
        super(passengers);
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "maxHeight=" + maxHeight +
                ", weight=" + weight +
                '}';
    }
}
