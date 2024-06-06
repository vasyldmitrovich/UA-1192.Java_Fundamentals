package com.softserve.edu08.hw;

import java.awt.event.WindowFocusListener;

abstract class Person {
    private FullName fullName; // Field of type FullName
    private int age;

//Constructor

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return ("First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age);
    }

    // Abstract method
    public abstract String activity();
}
