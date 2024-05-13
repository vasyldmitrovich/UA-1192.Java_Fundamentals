package com.softserve.edu05;
public class Employee {
    String name;// Add access modifier to fields
    int departmentNumber;
    double salary;

    // Add constructor without parameters

    Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    // Add getters and setters and equals toString and hashCode
}
