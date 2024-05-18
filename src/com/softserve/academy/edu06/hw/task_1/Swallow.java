package com.softserve.academy.edu06.hw.task_1;

public class Swallow extends FlyingBird
{
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Swallow is flying");
    }
}
