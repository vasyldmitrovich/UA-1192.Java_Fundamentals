package com.softserve.edu03.pt;

public class PrTask02 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 10.5, 10);
        Employee employee2 = new Employee("Bob", 8.0, 2);
        Employee employee3 = new Employee("Jack", 12, 20);

        System.out.println("Empl1 = " + employee1);
        System.out.println("Empl2 = " + employee2);
        System.out.println("Empl3 = " + employee3);

        System.out.println("Total sum: " + Employee.getTotalSum());
    }
}


