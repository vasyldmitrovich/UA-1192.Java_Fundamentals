package com.softserve.edu07.hw.task72;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(){}

    @Override
    public void fly() {
        System.out.println("The helicopter is flying");
    }

    @Override
    public void land() {
        System.out.println("The helicopter is landing");
    }

    //Here must be implementation of getters and setters, schema says nothing about it

}
