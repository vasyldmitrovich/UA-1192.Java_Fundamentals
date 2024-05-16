package com.softserve.edu07.hw.employee;

public class SalariedEmployee extends Employee {

    public static final int WORKING_DAYS_IN_MONTH = 22;

    private static final WorkersGroupInfo workersGroupInfo = new WorkersGroupInfo("Salaried");

    private int workingDays;
    private String socialSecurityNumber;

    public SalariedEmployee(String name, double salaryPerHour) {
        super(name, salaryPerHour);
        workingDays = WORKING_DAYS_IN_MONTH;
        //also need think up decrease workers count logic
        workersGroupInfo.addWorker(salaryPerHour);
    }

    public SalariedEmployee(String name, double salaryPerHour, int workingDays) {
        super(name, salaryPerHour);
        this.workingDays = workingDays;
        workersGroupInfo.addWorker(salaryPerHour);
    }

    public static double calculateSalariedWorkersAverageRate() {
        return workersGroupInfo.getAverageGroupSalaryPerHour();
    }

    public static int getWorkersCount() {
        return workersGroupInfo.getWorkersCount();
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return workingDays * WORKING_HOURS_PER_DAY * salaryPerHour;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.calculatePay(), this.calculatePay());
    }

    @Override
    public String toString() {
        return "Salaried{" +
                super.toString() +
                '}';
    }
}
