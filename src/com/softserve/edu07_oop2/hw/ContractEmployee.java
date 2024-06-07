package com.softserve.edu07_oop2.hw;

public class ContractEmployee extends Employee implements Payment{

    private String federalTaxIdmember;

    public ContractEmployee(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public ContractEmployee(String employeeID, String name, String federalTaxIdmember) {
        super(employeeID, name);
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public ContractEmployee() {
    }

    public ContractEmployee(String employeeID, String name) {
        super(employeeID, name);
    }

    @Override
    public int calculatePay() {
        return fixedPaid();

    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employeeID='" + getEmployeeID() + '\'' +
                ", name='" + getName() + '\'' +
                " federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", the average monthly salary: " + calculatePay() + '\'' +
                '}';
    }

    public int fixedPaid(){
        return 25000;
    }
}
