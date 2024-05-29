package com.softserve.edu06.hw.hw1;

public abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public Bird() {

    }

    public abstract void flay();

    @Override
    public String toString() {
        return "Feathers:" + feathers + "LayEggs:" + layEggs;

    }

    public abstract void fly();
}



