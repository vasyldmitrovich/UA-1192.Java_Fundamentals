package com.softserve.edu05.pt.entity;

public class Employee implements Comparable<Employee> {
    private String name;
    private Integer department;
    private String number;
    private Integer salary;

    public Employee() {
    }

    public Employee(String name, Integer department, String number, Integer salary) {
        this.name = name;
        this.department = department;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.salary.compareTo(o.getSalary());
    }
}
