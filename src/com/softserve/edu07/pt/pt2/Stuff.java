package com.softserve.edu07.pt.pt2;

abstract class Staff extends Person {
    abstract int salary();

    public Staff(String name) {
        super(name);
    }
}