package com.softserve.edu06.hw;

public class Swallow extends FlyingBird {
    private String name;

    public Swallow(boolean feathers, boolean layEggs, boolean fly, String name) {
        super(feathers, layEggs, fly);
        setName(name);
    }

    public String getName() {
        return "Bird: " + name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    protected void getInfo() {
        System.out.println(getName());
        super.getInfo();
    }

    @Override
    protected void feathers() {
        System.out.print("Swallows ");
        super.feathers();
    }
}
