package com.softserve.edu06.hw.company;

public class Employee {
    private final String NAME;
    private final int AGE;
    private final double SALARY;

    public Employee(String name, int age, double salary) {
        this.NAME = name;
        this.AGE = age;
        this.SALARY = salary;
    }

    protected String getNAME() {
        return NAME;
    }

    protected int getAGE() {
        return AGE;
    }

    protected double getSALARY() {
        return SALARY;
    }

    public String report() {
        return String.format("Name: %s, Age: %d,"+
                "Salary: \u20b4 %.2f.", NAME, AGE, SALARY);
    }
}
