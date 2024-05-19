package com.softserve.edu07_oop2.pt;

public class Cleaner extends Staff{

private final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(this);
        System.out.println("This person is " + TYPE_PERSON);

    }

    @Override
    public int salary() {
        return 10000;
    }
}
