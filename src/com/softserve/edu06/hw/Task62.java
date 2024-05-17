package com.softserve.edu06.hw;


public class Task62 {

    public static void execute(){
        System.out.println("Lets create and print a couple of employees");
        Employee employee1 = new Employee("Bob", 32, 2500);
        Employee employee2 = new Developer("Marta", "QA trainee", 25, 1000);

        System.out.println(employee1.report());
        System.out.println(employee2.report());


    }
}
