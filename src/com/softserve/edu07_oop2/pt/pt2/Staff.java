package com.softserve.edu07_oop2.pt.pt2;

public abstract class Staff extends Person {
    Staff(String name) {
        super(name);
    }

    // Abstract method to be implemented by subclasses
    abstract String salary();
}
