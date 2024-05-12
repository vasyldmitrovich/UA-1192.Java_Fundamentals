package com.softserve.edu06.hw;

public abstract class Bird {

    private boolean feathers;

    private boolean layEggs;

    public Bird() {
        this.feathers = false;
        this.layEggs = false;
    }

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean getFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
