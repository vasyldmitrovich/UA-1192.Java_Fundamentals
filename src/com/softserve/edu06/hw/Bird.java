package com.softserve.edu06.hw;

abstract class Bird {
    public String name;

    public static void bird() {
    }
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public abstract void fly();
}
