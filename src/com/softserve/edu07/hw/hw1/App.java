package com.softserve.edu07.hw.hw1;

import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("Oliver", "468", "468123", 45, 240),
                new ContractEmployee("Jack", "645", "456542", 42, 220),
                new SalariedEmployee("James", "249", "3242", 12000.00),
                new SalariedEmployee("Bill", "546", "2521", 14000.00),
        };
////        unsorted array
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i]);
//
//        }
////        Bubble sorting
//        for (int i = 0; i < employees.length - 1; i++) {
//            for (int j = 0; j < employees.length - 1 - i; j++) {
//                if (employees[j].calculatePay() < employees[j + 1].calculatePay()) {
//                    var swap = employees[j];
//                    employees[j] = employees[j + 1];
//                    employees[j + 1] = swap;
//                }
//            }
//        }
////        Sorted array
//        for (var employee : employees) {
//            System.out.println(employee.getInfo());
//        }

//        Comparable sorting 
        Arrays.sort(employees);
        for (var emp :employees){
            System.out.println(emp);
        }
    }

}