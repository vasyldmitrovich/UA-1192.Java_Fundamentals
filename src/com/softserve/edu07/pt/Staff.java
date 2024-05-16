package com.softserve.edu07.pt;

abstract class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    abstract int salary();
}
