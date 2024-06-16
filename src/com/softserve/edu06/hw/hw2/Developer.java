package com.softserve.edu06.hw.hw2;


public class Developer extends Employee {

    private String position;


    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;

    }

    @Override
    public String report() {

        return super.report() + String.format(", Position: %s", position);

    }

}
