package com.softserve.academy.edu06.hw.task_1;

public class Penguin extends NonFlyingBird
{
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Penguin is not flying");
    }
}
