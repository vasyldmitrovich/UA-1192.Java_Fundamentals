package com.softserve.edu08.hw;

public abstract class Person implements Cloneable {

    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = validateAge(age);
    }

    public abstract String activity();

    public void setAge(int age) {
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() +
                ", Last name: " + fullName.getLastName() +
                ", Age: " + age;
    }

    private int validateAge(int age) {
        if (age == 0) {
            return 1;
        } else if (age < 0) {
            return Math.abs(age);
        }
        return age;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.fullName = fullName.clone();
        return clone;
    }
}
