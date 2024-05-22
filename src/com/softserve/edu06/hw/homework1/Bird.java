package com.softserve.edu06.hw.homework1;// Rename package Homework1 to lowercase

public abstract class Bird {

    protected boolean feathers;
    protected boolean layEggs;

    public Bird (boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();
}
