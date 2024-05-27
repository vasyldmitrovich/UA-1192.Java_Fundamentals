package com.softserve.edu08.hw;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.fullName = new FullName(firstName, lastName);
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(String firstName, String lastName) {
        this.fullName = new FullName(firstName,lastName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("First name: <" + fullName.getFirstName() + ">, Last name: <" + fullName.getLastName() + ">, Age: <" + age + ">");
    }

    abstract String activity();
}
