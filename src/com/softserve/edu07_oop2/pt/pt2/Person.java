package com.softserve.edu07_oop2.pt.pt2;

public abstract class Person {
    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    abstract String print();
}
