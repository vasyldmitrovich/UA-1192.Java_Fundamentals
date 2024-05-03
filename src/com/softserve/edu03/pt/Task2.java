package com.softserve.edu03.pt;

public class Task2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Yurii");
        employee1.setRate(10.5);
        employee1.setHours(8);

        Employee employee2 = new Employee();
        employee2.setName("Vika");
        employee2.setRate(8.5);
        employee2.setHours(4);

        Employee employee3 = new Employee();
        employee3.setName("Marta");
        employee3.setRate(7);
        employee3.setHours(3);

        System.out.println("Employee1" + employee1);
        System.out.println("Employee2" + employee2);
        System.out.println("Employee3" + employee3);

        System.out.println(Employee.getTotalSum());
    }
}

class Employee{
    private static double totalSum = 0.0;

    private String name;
    private double rate;
    private  int hours;

    public Employee(){
    }

    public Employee(String name, double rate){
        this.name = name;
        setRate(rate);
    }

    public Employee(String name, double rate, int hours){
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    public double getSalary(){
        return rate * hours;
    }

    public double getBonuses(){
        return 0.1 * getSalary();
    }
    public static double getTotalSum() {
        return totalSum + 0.1 * totalSum;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
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

    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }


    @Override
    public String toString() {
        return STR."Employee{name='\{name}\{'\''}, rate=\{rate}, hours=\{hours}, salary= \{getSalary()}\{'}'}";
    }
}


