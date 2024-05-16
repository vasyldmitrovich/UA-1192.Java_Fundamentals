package com.softserve.edu07.hw;

class Helicopter extends FlyingVehicle {

    private int weight;

    private int maxHeight;

    public Helicopter() {
        this.weight = 0;
        this.maxHeight = 0;
    }

    @Override
    void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    void land() {
        System.out.println("Helicopter is landing");
    }


}
