package com.softserve.edu07_oop2.hw;

public class SalariedEmployee extends Employee implements Payment{

    private String socialSecurityNumber;

    public SalariedEmployee(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee(String employeeID, String name, String socialSecurityNumber) {
        super(employeeID, name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(String employeeID, String name) {
        super(employeeID, name);
    }

    @Override
    public int calculatePay() {
return hourlyRate() * hoursWorked();
    }

    public int hourlyRate(){
        return 250;
    }

    public int hoursWorked(){
        return 160;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeID='" + getEmployeeID() + '\'' +
                ", name='" + getName() + '\'' +
                " socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", the average monthly salary: " + calculatePay() + '\'' +
                '}';
    }
}
