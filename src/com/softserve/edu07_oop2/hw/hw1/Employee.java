package com.softserve.edu07_oop2.hw.hw1;

abstract class Employee implements Payment {// Implementation here is good decision
    String employeeId;// Make private and add getter and setter
    // Constructor
    Employee(String employeeId) {
        this.employeeId = employeeId;
    }
}
