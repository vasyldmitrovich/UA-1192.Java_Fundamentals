package com.softserve.edu06_oop1.hw.hw1;


public abstract class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying.");
    }// realize this method in not abstract class like Eagle
}
