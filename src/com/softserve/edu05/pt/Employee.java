package com.softserve.edu05.pt;

public class Employee {
    private String name;
    private int depNumber;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int depNumber, double salary) {
        this.depNumber = depNumber;
        this.name = name;
        this.salary = salary;
    }

    public int getDepNumber() {
        return depNumber;
    }

    public void setDepNumber(int depNumber) {
        this.depNumber = depNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
