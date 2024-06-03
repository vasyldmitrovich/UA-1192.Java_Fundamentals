package com.softserve.edu07.hw;

import com.softserve.edu07.hw1.ContractEmployee;
import com.softserve.edu07.hw1.Employee;
import com.softserve.edu07.hw1.Payment;
import com.softserve.edu07.hw1.SalariedEmployee;

public class AppHw {

    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee("E123", 30000, "KT1123");
        Employee contractEmployee = new ContractEmployee("E124", 50, 4.5);

        printEmployeePay(salariedEmployee);
        printEmployeePay(contractEmployee);
    }

    public static void printEmployeePay(Payment employee) {
//        System.out.println("Employee ID: " + ((Employee) employee).employeeId);// DO NOT CORRECT Cannot be accessed from outside package, Compilation error
        System.out.println("Pay: " + employee.calculatePay());
        System.out.println();
    }
}
