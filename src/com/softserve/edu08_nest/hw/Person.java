package com.softserve.edu08_nest.hw;

abstract class Person {
    public FullName fullName;
    public int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: <" + fullName.getFirstName() + "> "
                + ", Last name is: <" + fullName.getLastName() + "> "
                + ", Age is: <" + age + ">.";
    }

    public abstract String activity();
}
