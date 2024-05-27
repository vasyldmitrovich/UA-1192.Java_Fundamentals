package com.softserve.edu07.ptask;

abstract class Staff extends Person {
    abstract int salary();

    public Staff(String name) {
        super(name);
    }
}
