package com.softserve.edu08.hw;

import com.softserve.edu08.hw.FullName;

public abstract class Person implements Cloneable {

    private FullName fullName;
    private int age;

    public Person (FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + this.fullName.getFirstName() + ", Last name: " + this.fullName.getLastname() +
                ", Age: " + this.age;
    }

    public abstract String activity();

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.fullName = fullName.clone();
        return clone;
    }
}
