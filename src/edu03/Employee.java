package edu03;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static double totalSum = 0;

    public Employee(){
    }
        public Employee(String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
        }
    public double getSalary(){
        return hours * rate;
    }
    public double getBonuses(){
        return getSalary() * 0.1;
    }
    public String toString(){
        return "Name: " + name + "salary: " + getSalary();
    }
    public static void main(String[] args){
        Employee e1 = new Employee("John ", 24.5, 42);
        Employee e2 = new Employee("Jane ", 19.2, 34);
        Employee e3 = new Employee("Andrew ", 24.8, 46);

        System.out.println("information about workers: ");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("/nTotal salary of every workers: " + totalSum);
    }
}
