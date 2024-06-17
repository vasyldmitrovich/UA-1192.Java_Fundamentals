package com.softserve.edu06.hw;

public class Eagle extends FlyingBird {
    private String name;

    public Eagle(boolean feathers, boolean layEggs, boolean fly, String name) {
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
        System.out.print("Eagles ");
        super.feathers();
    }
}
