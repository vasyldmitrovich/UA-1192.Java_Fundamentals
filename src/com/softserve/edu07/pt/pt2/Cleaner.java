package com.softserve.edu07.pt.pt2;

public class Cleaner extends Staff {
    final String TYPE_PERSON = getClass().getSimpleName();
    double salary;

    public Cleaner() {
    }

    public Cleaner(String name, double salary) {
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
        return "Cleaner{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
