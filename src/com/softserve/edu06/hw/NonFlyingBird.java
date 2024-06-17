package com.softserve.edu06.hw;

public class NonFlyingBird extends Bird {
    private boolean fly;

    public NonFlyingBird(boolean feathers, boolean layEggs, boolean fly) {
        super(feathers, layEggs);
        this.fly = fly;
    }

    @Override
    protected void fly() {
        if (fly) {
            System.out.println("This bird can fly.");
        } else System.out.println("This bird can't fly.");


    }

    @Override
    protected void feathers() {
        if (feathers) {
            System.out.print("have a feathers");
        } else System.out.print("doesn't have a feathers");
    }

    @Override
    protected void layEggs() {
        if (layEggs) {
            System.out.print(" and they can lay eggs.");
        } else System.out.print(" and they can't lay eggs.");
    }

    @Override
    protected void getInfo() {
        fly();
        feathers();
        layEggs();
    }
}
