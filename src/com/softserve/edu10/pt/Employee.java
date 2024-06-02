package com.softserve.edu10.pt;

import java.time.LocalDate;

record Employee(
        int id,
        String name,
        Position position,
        double salary,
        LocalDate dateOfBirth
) {
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public Employee withName(String name){
        return new Employee(id,name,position,salary,dateOfBirth);
    }
    public Employee withPosition(Position position){
        return new Employee(id,name,position,salary,dateOfBirth);
    }

    public Employee withSalary(double newSalary) {
        return new Employee(id,name,position,newSalary,dateOfBirth);
    }
}
enum Position {
    DEV,QA,DEVOPS,MANAGER;
}
