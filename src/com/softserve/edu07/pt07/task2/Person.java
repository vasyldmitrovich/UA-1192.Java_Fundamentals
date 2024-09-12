package com.softserve.edu07.pt07.task2;

public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
