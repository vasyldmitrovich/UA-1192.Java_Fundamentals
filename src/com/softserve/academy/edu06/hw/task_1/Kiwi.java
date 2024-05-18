package com.softserve.academy.edu06.hw.task_1;

public class Kiwi extends NonFlyingBird
{
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly() {
        System.out.println("Kiwi is not flying");
    }
}
