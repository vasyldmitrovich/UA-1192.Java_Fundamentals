package com.softserve.edu07_oop2.hw.hw1;

abstract class Employee implements Payment {
    String employeeId;
    // Constructor
    Employee(String employeeId) {
        this.employeeId = employeeId;
    }
}
