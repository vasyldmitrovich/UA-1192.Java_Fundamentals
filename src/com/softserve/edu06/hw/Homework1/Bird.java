package com.softserve.edu06.hw.Homework1;

public abstract class Bird {

    protected boolean feathers;
    protected boolean layEggs;

    public Bird (boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();
}
