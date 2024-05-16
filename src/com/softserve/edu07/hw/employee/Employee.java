package com.softserve.edu07.hw.employee;

public abstract class Employee implements Payment, Comparable<Employee> {

    public static final int WORKING_HOURS_PER_DAY = 8;

    private static final WorkersGroupInfo workersGroupInfo = new WorkersGroupInfo("All workers");

    protected String employeeId;
    protected String name;
    //troubles if change salary in the middle of month
    protected double salaryPerHour;

    public Employee(String name, double salaryPerHour) {
        this.name = name;
        this.salaryPerHour = salaryPerHour;
        workersGroupInfo.addWorker(salaryPerHour);
    }

    public static double calculateAllWorkersAverageRate() {
        return workersGroupInfo.getAverageGroupSalaryPerHour();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", salaryPerMonth=" + String.format("%.2f", calculatePay()) +
                '}';
    }

    protected static class WorkersGroupInfo {

        private final String groupName;
        private int workersCount;
        private double totalSalary;

        public WorkersGroupInfo(String groupName) {
            this.groupName = groupName;
            workersCount = 0;
            totalSalary = 0;
        }

        public WorkersGroupInfo(String groupName, int workersCount, double totalSalary) {
            this.groupName = groupName;
            this.workersCount = workersCount;
            this.totalSalary = totalSalary;
        }

        public int getWorkersCount() {
            return workersCount;
        }

        public String getGroupName() {
            return groupName;
        }

        public void addWorker(double workerSalary) {
            workersCount++;
            totalSalary += workerSalary;
        }

        public void removeWorker(double workerSalary) {
            workersCount--;
            totalSalary -= workerSalary;
        }

        public double getAverageGroupSalaryPerHour() {
            return totalSalary / workersCount;
        }

    }

}
