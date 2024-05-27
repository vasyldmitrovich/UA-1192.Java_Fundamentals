package com.softserve.edu07.hw;

import java.util.Objects;

public abstract class Employee implements Payment {
    String employeeId;// Make private fields
    String name;

    public Employee(String employeeId, String name){
    this.employeeId = employeeId;
    this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getEmployeeId(){
        return employeeId;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
