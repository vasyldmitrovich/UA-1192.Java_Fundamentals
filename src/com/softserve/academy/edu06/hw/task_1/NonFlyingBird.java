package com.softserve.academy.edu06.hw.task_1;

public class NonFlyingBird extends Bird
{
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Non-flying bird is not flying");
    }
}
