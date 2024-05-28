package com.softserve.edu07.pt.pt2;

public abstract class Person {
    public String name;// Public is not good

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();
}
