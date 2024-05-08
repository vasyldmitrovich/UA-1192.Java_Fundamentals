package com.softserve.edu05.pt;

public class Employee {

    private String name;

    private String departmentNumber;

    private double salary;

    public Employee() {
        this.name = "";
        this.departmentNumber = "";
        this.salary = 0;
    }

    public Employee(String name, String departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber='" + departmentNumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}
