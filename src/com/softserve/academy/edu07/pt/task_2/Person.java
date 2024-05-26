package com.softserve.academy.edu07.pt.task_2;

public abstract class Person {
    protected String name;
    public static final String TYPE_PERSON = "Person";

    public Person(String name) {
        this.name = name;
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public abstract void print();

    public String getName() {
        return name;
    }
}
