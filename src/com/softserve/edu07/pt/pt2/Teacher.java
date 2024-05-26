package com.softserve.edu07.pt.pt2;

public class Teacher extends Staff {
    final String TYPE_PERSON = getClass().getSimpleName();
    double salary;

    public Teacher() {
    }

    public Teacher(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("I am a..." + TYPE_PERSON + " " + getName());
    }

    @Override
    public double salary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
