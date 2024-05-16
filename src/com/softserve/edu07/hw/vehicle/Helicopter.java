package com.softserve.edu07.hw.vehicle;

public class Helicopter extends FlyingVehicle {

    private int weight;
    private int maxHeight;

    public Helicopter() {
        weight = RAND.nextInt(2000) + 3000;
        maxHeight = RAND.nextInt(5000) + 3000;
        passengers = 2;
    }

    @Override
    public void fly() {
        System.out.println("Engine starts...");
        System.out.println("Helicopter's weight: " + weight);
        System.out.println("Helicopter's max height: " + maxHeight);
        System.out.println("Helicopter takes off");
        System.out.println("Flying...");
        land();
    }

    @Override
    public void land() {
        System.out.println("Helicopter starts landing");
    }
}
