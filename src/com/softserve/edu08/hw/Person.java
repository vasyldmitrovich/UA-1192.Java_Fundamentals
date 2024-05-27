package com.softserve.edu08.hw;

public abstract class Person implements Cloneable {
    private FullName fullName;// Make private and add getters and setters
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return String.format("\"First name: %s, Last name: %s, Age: %d\"", fullName.getFirstName(), fullName.getLastName(), age);
    }

    public abstract String activity();

}
