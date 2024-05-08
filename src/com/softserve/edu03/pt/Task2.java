package com.softserve.edu03.pt;

public class Task2 {
    public static void main (String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Alex");
        employee1.setRate(5.5);
        employee1.setHours(40);

        Employee employee2 = new Employee("Iryna", 8.8);
        employee2.setHours(42);

        Employee employee3 = new Employee("Roman", 10.7, 40);

        System.out.println("Employee1 = "+employee1);
        System.out.println("Employee2 = "+employee2);
        System.out.println("Employee3 = "+employee3);
        System.out.println("%.2f".formatted(Employee.getTotalSum()));
    }
}
