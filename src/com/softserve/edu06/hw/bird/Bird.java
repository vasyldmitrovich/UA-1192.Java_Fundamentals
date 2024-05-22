package com.softserve.edu06.hw.bird;

public abstract class Bird {// Nice
    private boolean feathers;
    private boolean layEggs;

    protected Bird() {
    }

    protected void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    protected void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    protected boolean isFeathers() {
        return feathers;
    }

    protected boolean isLayEggs() {
        return layEggs;
    }

    public abstract void fly();
}
