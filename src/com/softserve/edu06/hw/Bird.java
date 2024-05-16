package com.softserve.edu06.hw;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public abstract void fly();

    public abstract void print();

    public Bird(){
        feathers=true;
        layEggs=true;
    }
    public Bird(boolean feathers,boolean layEggs){
        this.feathers=feathers;
        this.layEggs=layEggs;
    }
    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }
}
