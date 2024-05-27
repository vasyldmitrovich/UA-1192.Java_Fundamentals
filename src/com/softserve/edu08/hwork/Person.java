package com.softserve.edu08.hwork;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return "First name: <" + fullName.getFirstName() + "> "
                + ", Last name is: <" + fullName.getLastName() + "> "
                + ", Age is: <" + age + ">.";
    }

    public abstract String activity();
}
