package com.softserve.edu07_oop2.hw;

import com.softserve.edu07_oop2.pt.Staff;

public abstract class Employee {

    private String employeeID;
    private String name;

    public Employee() {
    }

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

//    public int getSalary(){
//        for (var person : Employee ) {
//
//            person.print();
//
//            if(person instanceof Employee staff) {
//                System.out.println("Salary on his position is " + staff.());
//            }
//        }
//    }
}

