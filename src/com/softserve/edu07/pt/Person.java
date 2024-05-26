package com.softserve.edu07.pt;

abstract class Person {// Ok
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();// You can write without public abstract words, it is by default

    public String getName() {
        return name;
    }
}