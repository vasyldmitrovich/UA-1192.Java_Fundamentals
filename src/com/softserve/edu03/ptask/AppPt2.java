package com.softserve.edu03.ptask;

public class AppPt2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Nastya");
        employee1.setRate(10);
        employee1.setHours(10);
        Employee employee2 = new Employee("Mykola",10,10);
        Employee employee3 = new Employee("Alla",10, 10);
        System.out.println("Employee1 = " + employee1);
        System.out.println("Employee2 = " + employee2);
        System.out.println("Employee3 = " + employee3);

        System.out.println("The total salary of all employees: " + Employee.getTotalSum());
        }
    }

