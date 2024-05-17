package com.softserve.edu07.pt;

public abstract class Staff extends Person{
    public Staff(String name) {
        super(name);
    }

    abstract public int salary();
    @Override
    public void print() {
        System.out.println("My name is "+getName());
    }
}
