package com.softserve.academy.edu06.hw.task_1;

public class Eagle extends FlyingBird
{
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Eagle is flying");
    }
}
