package com.softserve.edu06.hw.hw1;

public class Flyingbird extends Bird {// Ok
    private boolean fly;


    public Flyingbird(boolean feathers, boolean layEggs, boolean fly) {
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
            System.out.print("have feathers");
        } else System.out.print("doesn't have feathers");
    }

    @Override
    protected void layEggs() {
        if (layEggs) {
            System.out.print(" and they can lay eggs.");
        } else System.out.print(" and they can't lay eggs.");
    }

    @Override
    protected void getInfo() {
        System.out.println("\t".repeat(4) + "INFO");
        fly();
        feathers();
        layEggs();
        System.out.println("\n" + "-".repeat(50));
    }
}
