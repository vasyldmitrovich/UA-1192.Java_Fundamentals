package com.softserve.edu06_oop1.hw.hw1;

public abstract class Bird {
    protected String feathers;
    protected boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
