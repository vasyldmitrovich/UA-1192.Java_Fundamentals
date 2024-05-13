package com.softserve.edu05.pt;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;
    public Employee(){

    }
    public Employee(String name,int departmentNumber,int salary){
        this.name = name;
        this.departmentNumber=departmentNumber;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}
