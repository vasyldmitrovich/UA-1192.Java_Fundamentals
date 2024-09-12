package com.softserve.edu06.hw06.Birdfly;

abstract class Bird {
    boolean feathers;
    boolean layEggs;

    abstract void fly();

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public void printInfo() {
        System.out.println("Can this bird fly: " + (canFly() ? "Yes" : "No"));
        System.out.println("Does this bird have feathers: " + feathers);
        System.out.println("Does this bird lay eggs: " + layEggs);
    }

    private boolean canFly() {
        return this instanceof FlyingBird;
    }
}