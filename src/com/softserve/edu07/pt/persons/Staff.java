package com.softserve.edu07.pt.persons;

public abstract class Staff extends Person {

    public Staff(String name) {
        super(name);
    }

    public abstract double salary();
}
