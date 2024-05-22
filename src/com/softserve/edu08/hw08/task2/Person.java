package com.softserve.edu08.hw08.task2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String info() {
        return "Name: " + name + ", Age: " + age;
    }

    public String activity() {
        return "General activity";
    }
}
