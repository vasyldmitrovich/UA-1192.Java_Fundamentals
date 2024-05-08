package com.softserve.edu03.pt;


import java.util.Scanner;

public class AppPractical {// Do not forget spaces and all tasks should run when i run main method
    public static void main(String[] args) {
        //Test for first task
        Scanner scanner = new Scanner(System.in);
        double first = getNumber(scanner,"Please enter first double ");
        double second = getNumber(scanner,"Please enter second double ");
        System.out.println("Your sum of numbers: "+getTotal(first,second));
        System.out.println("Your average of numbers: "+getAverage(first,second));

        //Test for second task
        Employee employee1 = new Employee("Pavlo",1000,20);
        System.out.println("Info about first employee\n"+employee1.toString());
        Employee employee2 = new Employee("Cherchil");
        System.out.println("Info about second employee\n"+employee2.toString());
        Employee employee3 = new Employee();
        System.out.println("Info about third employee\n"+employee3.toString());
        Employee employee4 = new Employee("Dmitro",100,2);
        Employee employee5 = new Employee("Polina",3000,10);
        System.out.println("Info about salary first  employee: "+employee1.getSalary());
        System.out.println("Info about bonus first employee: "+ employee1.getBonus());
        employee1.setRate(100);
        System.out.println("Info about rate first employee by getter and setter: "+employee1.getRate());
        System.out.println("Info about total salary of all employee:"+Employee.totalSum);


    }
    public static double getTotal(double first,double second){
        return first+second;
    }

    public static double getAverage(double first,double second){
        return (first+second)/2;
    }

    public static double getNumber(Scanner scanner,String prompt){
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number:");
            scanner.next();
        }
        return scanner.nextDouble();
    }

}
