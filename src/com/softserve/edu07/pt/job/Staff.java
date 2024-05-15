package com.softserve.edu07.pt.job;

public abstract class Staff extends Person {

    protected double salary;

    public Staff(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    //should be printSalary()
    public abstract void salary();

}
