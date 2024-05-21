package com.softserve.edu06.hw.entity;

public abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Feathers: " + feathers + ", Lay Eggs: " + layEggs;
    }
}