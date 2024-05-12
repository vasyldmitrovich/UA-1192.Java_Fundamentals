package com.softserve.edu06.hw.bird;

public abstract class Bird {

    protected boolean hasFeathers;
    protected boolean canLayEggs;

    public Bird() {
        this.hasFeathers = true;
        this.canLayEggs = true;
    }

    public Bird(boolean hasFeathers, boolean canLayEggs) {
        this.hasFeathers = hasFeathers;
        this.canLayEggs = canLayEggs;
    }

    public abstract void fly();

    public boolean isHasFeathers() {
        return hasFeathers;
    }

    public void setHasFeathers(boolean hasFeathers) {
        this.hasFeathers = hasFeathers;
    }

    public boolean isCanLayEggs() {
        return canLayEggs;
    }

    public void setCanLayEggs(boolean canLayEggs) {
        this.canLayEggs = canLayEggs;
    }
}
