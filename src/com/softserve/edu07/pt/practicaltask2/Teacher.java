package com.softserve.edu07.pt.practicaltask2;

public class Teacher extends Staff{

    final String TYPE_PERSON = "Teacher";

    private int salary;

    public Teacher() {
        this.name = "Roman";
        this.salary = 12000;
        System.out.println(TYPE_PERSON);
    }

    public Teacher(String name, int salary) {
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
