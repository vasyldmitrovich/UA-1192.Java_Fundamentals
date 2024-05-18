package com.softserve.edu07.hw.entitiesHw1;

public abstract class Employee{
    private String employeeId;
    public String name;
    public Employee(){
        employeeId = "";
        name="";
    }
    public Employee(String employeeId,String name){
        this.employeeId=employeeId;
        this.name=name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
