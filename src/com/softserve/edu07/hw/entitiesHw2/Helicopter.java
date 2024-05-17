package com.softserve.edu07.hw.entitiesHw2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;
    public Helicopter(int passengers,int weight,int maxHeight) {
        super(passengers);
        this.weight=weight;
        this.maxHeight=maxHeight;
    }

    @Override
    public void fly() {
        System.out.printf("I can fly to an max height of %d and pull a weight of %d with %d passengers",maxHeight,weight,getPassengers());
        System.out.println();
    }

    @Override
    void land() {
        System.out.println("I can sit upright");
    }
}
