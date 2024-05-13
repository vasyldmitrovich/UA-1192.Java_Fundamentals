package com.softserve.edu05.pt;

import java.util.*;
import java.util.stream.Collectors;

public class Task54 {
/*
Create a class called Employee with fields: name, department number, salary.
• In main() method create five objects of class Employee.
• Output results for:
    all employees of a certain department (input department number in the console);
    arrange workers by the field salary in descending order.
 */

    public List<Employee> allFromDepartment(int department, Employee[] employees){
//       Using foreach loop
//        List<Employee> allFromDep = new ArrayList<>();
//        for (Employee employee: employees){
//            if(employee.getDepartment() == department){
//                allFromDep.add(employee);
//            }
//        }
//        return allFromDep;

        //Using stream
        return Arrays.stream(employees).filter(employee -> department == employee.getDepartment()).collect(Collectors.toList());

    }

    public Employee[] createEmplArr(){
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Boba Fett", 14, 2700.0);
        employees[1] = new Employee("Jango Fett", 27, 1800.0);
        employees[2] = new Employee("Feta Cheese", 1, 150.0);
        employees[3] = new Employee("Spongebob", 14, 1300.0);
        employees[4] = new Employee("Boss", 14, 4000.0);

        return employees;
    }

    public void execute(){
        //create five objects of class Employee
        Employee[] employees = createEmplArr();

        //Output results for all employees of a certain department (input department number in the console)
        System.out.println("All employees of a certain department");
        System.out.println("Enter department number: ");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        List<Employee> filtered = allFromDepartment(department, employees);
        if(filtered.size() >0){
            System.out.println("Employees from " + department + " department");
            System.out.println(filtered);
        }else {
            System.out.println("There are no people in this department");
        }
        System.out.println();

        //arrange workers by the field salary in descending order
        System.out.println("Workers arranged by the salary in descending order:");
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed());
        Arrays.stream(employees).forEach(employee -> System.out.println(employee.getName() + " \t " + employee.getSalary()));
    }

}
