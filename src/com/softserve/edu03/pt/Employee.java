package com.softserve.edu03.pt;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static final double percFromSalary = 0.1;
    private static double totalSum = 0.0;

    public static void main(String[] args){
        Employee employee1 = new Employee();
        employee1.setName("Miranda");
        employee1.setRate(20);
        employee1.setHours(15);

        Employee employee2 = new Employee();
        employee2.setName("Jhon");
        employee2.setRate(18.5);
        employee2.setHours(12);

        Employee employee3 = new Employee();
        employee3.setName("Sarah");
        employee3.setRate(16.5);
        employee3.setHours(10);

        System.out.println("Employee1" + employee1);
        System.out.println("Employee2" + employee2);
        System.out.println("Employee3" + employee3);

        System.out.println(getTotalSum());
    }

    public Employee() {
    }

    public Employee(String name, double rate){
        this.name = name;
        setRate(rate);
    }

    public Employee(String name, double rate, double hours){
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    public double getSalary(){
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary= " + getSalary() +
                ", bonuses= " + getBonuses() +
                '}';
    }

    public double getBonuses(){
        return  percFromSalary * getSalary();
    }

    public static double getTotalSum() {
        return totalSum + percFromSalary * totalSum;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }
    public double getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public void setHours(double hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

}
