package com.softserve.edu06.hw;

public class Kiwi extends NonFlyingBird {
    private String name;

    public Kiwi(boolean feathers, boolean layEggs, boolean fly, String name) {
        super(feathers, layEggs, fly);
        setName(name);
    }

    public String getName() {
        return "Bird: " + name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    protected void getInfo() {
        System.out.println(getName());
        super.getInfo();
    }

    @Override
    protected void feathers() {
        System.out.print("Kiwi birds ");
        super.feathers();
    }
}
