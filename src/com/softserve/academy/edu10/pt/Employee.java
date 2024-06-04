package com.softserve.academy.edu10.pt;

class Employee {
    int id;
    String name;
    String position;
    double salary;
    String dateOfBirth;

    public Employee(int id, String name, String position, double salary, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Position: " + position +
                ", Salary: " + salary +
                ", Date of Birth: " + dateOfBirth;
    }
}