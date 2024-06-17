package com.softserve.edu07.pt.pt2;

public class Cleaner extends Staff{
    private final String position = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    int salary() {
        return 350;
    }

    @Override
    public void print() {
        System.out.println("Position " + position);

    }
}
