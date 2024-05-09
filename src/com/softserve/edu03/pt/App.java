package com.softserve.edu03.pt;

import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

//        Task1.task1();
        task2();
    }

    // Write method and this code put in that method and call this method here in main method
        public static void task2(){
        Employee employee1 = new Employee();
        System.out.print("Input name: ");
        String name = SCANNER.nextLine();
        employee1.setName(name);
        System.out.print("Input rate of " + employee1.getName() + ": ");
        float rate = SCANNER.nextFloat();
        employee1.setRate(rate);
        System.out.print("Input hours of " + employee1.getName() + ": ");
        float hours = SCANNER.nextFloat();
        SCANNER.nextLine();
        employee1.setHours(hours);

        Employee employee2 = new Employee();
        System.out.print("Input name: ");
        String name2 = SCANNER.nextLine();
        employee2.setName(name2);
        System.out.print("Input rate of " + employee2.getName() + ": ");
        float rate2 = SCANNER.nextFloat();
        employee2.setRate(rate2);
        System.out.print("Input hours of " + employee2.getName() + ": ");
        float hours2 = SCANNER.nextFloat();
        SCANNER.nextLine();
        employee2.setHours(hours2);

        Employee employee3 = new Employee();
        System.out.print("Input name: ");
        String name3 = SCANNER.nextLine();
        employee3.setName(name3);
        System.out.print("Input rate of " + employee3.getName() + ": ");
        float rate3 = SCANNER.nextFloat();
        employee3.setRate(rate3);
        System.out.print("Input hours of " + employee3.getName() + ": ");
        float hours3 = SCANNER.nextFloat();
        employee3.setHours(hours3);



        System.out.print("Total salary is: " +  Employee.getTotalSum());
       }



}
