package com.softserve.edu06.hw;

public class Penguin extends NonFlyingBird {
    private String name;

    public Penguin(boolean feathers, boolean layEggs, boolean fly, String name) {
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
        System.out.print("Penguins ");
        super.feathers();
    }
}
