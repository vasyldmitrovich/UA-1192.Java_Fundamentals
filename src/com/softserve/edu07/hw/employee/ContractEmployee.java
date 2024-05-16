package com.softserve.edu07.hw.employee;

public class ContractEmployee extends Employee {

    private static final WorkersGroupInfo workersGroupInfo = new WorkersGroupInfo("Contract");

    private int workingHours;
    private String federalTaxMemberId;

    public ContractEmployee(String name, double salaryPerHour) {
        super(name, salaryPerHour);
        workingHours = 0;
        workersGroupInfo.addWorker(salaryPerHour);
    }

    public ContractEmployee(String name, double salaryPerHour, int workingHours) {
        super(name, salaryPerHour);
        this.workingHours = workingHours;
        workersGroupInfo.addWorker(salaryPerHour);
    }

    public static double calculateContractWorkersAverageRate() {
        return workersGroupInfo.getAverageGroupSalaryPerHour();
    }

    public static int getWorkersCount() {
        return workersGroupInfo.getWorkersCount();
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getFederalTaxMemberId() {
        return federalTaxMemberId;
    }

    public void setFederalTaxMemberId(String federalTaxMemberId) {
        this.federalTaxMemberId = federalTaxMemberId;
    }

    @Override
    public double calculatePay() {
        return workingHours * salaryPerHour;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.calculatePay(), this.calculatePay());
    }

    @Override
    public String toString() {
        return "Contract{" +
                super.toString() +
                '}';
    }
}
