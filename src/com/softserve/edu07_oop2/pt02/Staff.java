package com.softserve.edu07_oop2.pt02;

public abstract class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    abstract int salary();
}
