package com.softserve.edu08.hw;

public abstract class Person implements Cloneable {
    FullName fullName;
    int age;

    public Person() {
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public String info() {
        String gap = "\n";
        return ("First name: " + getFullName().getFirstName() + gap + "Last name: " + getFullName().getLastName() +
                gap + "Age: " + getAge());
    }

    public abstract String activity();

}
