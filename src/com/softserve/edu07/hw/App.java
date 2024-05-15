package com.softserve.edu07.hw;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Employee[] employees = {
                new ContractEmployee("id-1", 10, 40, "12345"),
                new SalariedEmployee("id-2", 1000, "sec-234"),
                new ContractEmployee("id-3", 15, 35, "12346"),
                new SalariedEmployee("id-4", 5000, "sec-235"),
        };

        Arrays.sort(employees, (o1, o2) -> {
            if ((o1 instanceof ContractEmployee || o1 instanceof SalariedEmployee) && (o2 instanceof ContractEmployee || o2 instanceof SalariedEmployee)) {
                return (int) (((Payment) o2).calculatePay() - ((Payment) o1).calculatePay());
            }
            return 0;
        });

        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeId());
        }

    }
}
