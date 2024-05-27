package com.softserve.academy.edu07.hw;


import com.softserve.academy.edu07.hw.task_1.ContractEmployee;
import com.softserve.academy.edu07.hw.task_1.Employee;
import com.softserve.academy.edu07.hw.task_1.SalariedEmployee;
//import org.jetbrains.annotations.NotNull;

public class App {

    public static void main(String[] args) {// Ok
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Task 1:" +
                "         Create an interface called Payment with the method calculatePay(), the base\n" +
                " abstract class called Employee with a String variable employee id.\n" +
                " Create two classes, SalariedEmployee and ContractEmployee, which\n" +
                " implement Payment interface and inherit from the base class Employee.\n" +
                "• Describe hourly-paid workers in the relevant classes (one of the child\n" +
                "   classes), and fixed paid workers in the other.\n" +
                "• Describe the String variable socialSecurityNumber in the SalariedEmployee class .\n" +
                "• Include a description of federalTaxId member variable in the ContractEmployee class.\n"+
                 " In main() method create an array of employees and add the employees\n" +
                "with different form of payment.\n" +
                "o\n" +
                " Arrange the entire sequence of workers in descending order of the average\n" +
                "monthly wage. Output the employee ID, name, and the average monthly\n" +
                "wage for all elements of the list.");

        Employee[] contractEmployee = createEmployees();

        double totalSalary = getTotalSalary(contractEmployee);
        for (Employee employee : contractEmployee) {
            System.out.println("Contract Employee : " + employee.getName());
            if (employee instanceof ContractEmployee) {
                ContractEmployee contractEmployee1 = (ContractEmployee) employee;
                System.out.println("Payment: " + contractEmployee1.calculatePay() + String.format(", average: %.2f%%", ((contractEmployee1.calculatePay()/totalSalary) * 100)));
                System.out.println("ID: " + contractEmployee1.getId());
            } else if (employee instanceof SalariedEmployee) {
                SalariedEmployee salariedEmployee = (SalariedEmployee) employee;
                System.out.println("Payment: " + salariedEmployee.calculatePay() + String.format(", average: %.2f%%", ((salariedEmployee.calculatePay()/totalSalary) * 100)));
                System.out.println("ID: " + salariedEmployee.getId());
            }
            System.out.println("-------------------------------------------------");
        }
    }

    private static Employee /*@NotNull*/ [] createEmployees() {
        Employee[] contractEmployee = new Employee[5];
        contractEmployee[0] = new ContractEmployee("John", 40, 10, 123456);
        contractEmployee[1] = new ContractEmployee("Jane", 50, 15, 654321);
        contractEmployee[2] = new SalariedEmployee("Jack", 1000, 987654);
        contractEmployee[3] = new SalariedEmployee("Jill", 2000, 456789);
        contractEmployee[4] = new SalariedEmployee("Jim", 3000, 987654);
        return contractEmployee;
    }

    private static double getTotalSalary(Employee[] contractEmployee) {
        double totalSalary = 0;
        for (Employee employee : contractEmployee) {
            if (employee instanceof ContractEmployee) {
                ContractEmployee contractEmployee1 = (ContractEmployee) employee;
                totalSalary += contractEmployee1.calculatePay();
            } else if (employee instanceof SalariedEmployee) {
                SalariedEmployee salariedEmployee = (SalariedEmployee) employee;
                totalSalary += salariedEmployee.calculatePay();
            }

        }
        return totalSalary;
    }

    public static void task2() {
        System.out.println("Task 2:" +
                "Create and test a program’s structure corresponding to the next schema:\n" +
                "• check in folder task_2 \n");



    }
}
