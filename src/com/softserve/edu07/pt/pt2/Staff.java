package com.softserve.edu07.pt.pt2;

public abstract class Staff extends Person {
    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    public abstract double salary();
}