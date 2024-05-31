package com.softserve.edu07.pt2;

public abstract class Person {

    String name;
    static final String TYPE_PERSON = "Person";

    Person(String name) {
        this.name = name;
        System.out.println("Type: " + TYPE_PERSON);
    }

    abstract int salary();

    public abstract void print();
}