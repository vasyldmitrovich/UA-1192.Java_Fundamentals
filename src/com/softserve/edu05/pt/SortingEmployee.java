package com.softserve.edu05.pt;

public class SortingEmployee {
    public static void sortEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }
            }
        }
    }
}
