package com.softserve.edu07.pt.practicaltask2;

public class Cleaner extends Staff{

    final String TYPE_PERSON = "Cleaner";

    private int salary;

    public Cleaner() {
        this.name = "Taras";
        this.salary = 9000;
        System.out.println(TYPE_PERSON);
    }

    public Cleaner(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println(TYPE_PERSON);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("I am a " + getTYPE_PERSON() + ". My name is " + this.name);
    }

    @Override
    public void salary() {
        System.out.println("My salary is " + this.salary);
    }
}
