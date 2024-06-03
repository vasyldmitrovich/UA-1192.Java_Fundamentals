package com.softserve.edu07.hw1;

public  class SalariedEmployee extends Employee {// You do not use reformat code, code is hard to reed
    private String socialSecurityNumber;
    private double monthlySalary;

    public SalariedEmployee(String employeeId, double annualSalary, String socialSecurityNumber) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculatePay(){
        return monthlySalary;
    }
@Override
public String toString() {
    return "SalariedEmployee{" +
            "employeeId='" + employeeId + '\'' +
            ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
            ", monthlySalary=" + monthlySalary +
            '}';
}

}


