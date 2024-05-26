package com.softserve.edu08.hw;

public abstract class Person implements Cloneable{
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info () {
        return "\n First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age:" + age;
    }
    public abstract String activity();

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
