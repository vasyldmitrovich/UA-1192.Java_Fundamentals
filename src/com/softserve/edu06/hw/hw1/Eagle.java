package com.softserve.edu06.hw.hw1;

public class Eagle extends Flyingbird {
    private String name;

    public Eagle(boolean feathers, boolean layEggs, boolean fly, String name) {
        super(feathers, layEggs, fly);
        setName(name);
    }

    public String getName() {
        return "Name of bird: " + name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    protected void getInfo() {
        System.out.println("-".repeat(50));
        System.out.println(getName());
        super.getInfo();
    }

    @Override
    protected void feathers() {
        System.out.print("Eagles ");
        super.feathers();
    }
}

