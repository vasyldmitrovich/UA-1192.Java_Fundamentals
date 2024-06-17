package com.softserve.edu06.hw;

public abstract class Bird {
    protected final boolean feathers;
    protected final boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    protected abstract void fly();
    protected abstract void feathers();
    protected abstract void layEggs();
    protected abstract void getInfo();
}