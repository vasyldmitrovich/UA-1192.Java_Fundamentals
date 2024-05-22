package com.softserve.edu08.hw;

public abstract class Person {
    private FullName fullName;
    private int age;

    public abstract String activity();

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "Name:" + fullName.getFirstName() +
                ", Surname:" + fullName.getLastName() +
                ", Age:" + age;
    }


}
