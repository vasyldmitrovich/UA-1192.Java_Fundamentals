package com.softserve.edu07.ptask;

abstract class Person {
    private String name;

    public String getName() {
        return name;
    }// getters go after constructors

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();
}
