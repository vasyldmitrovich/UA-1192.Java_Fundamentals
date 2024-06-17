package com.softserve.edu06.hw;

public class FlyingBird extends Bird {
    private boolean fly;

    public FlyingBird(boolean feathers, boolean layEggs, boolean fly) {
        super(feathers, layEggs);
        this.fly = fly;
    }

    @Override
    protected void fly() {
        if (fly) {
            System.out.println("Can fly.");
        } else System.out.println("Can't fly.");
    }

    @Override
    protected void feathers() {
        if (feathers) {
            System.out.print("have feathers");
        } else System.out.print("doesn't have feathers");
    }

    @Override
    protected void layEggs() {
        if (layEggs) {
            System.out.println(" and can lay eggs.");
        } else System.out.println(" and can't lay eggs.");
    }

    @Override
    protected void getInfo() {
        fly();
        feathers();
        layEggs();
    }
}
