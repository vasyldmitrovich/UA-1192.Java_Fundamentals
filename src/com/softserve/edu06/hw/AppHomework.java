package com.softserve.edu06.hw;


import com.softserve.edu06.hw.entity.*;


public class AppHomework {
    public static void main(String[] args) {// Good
        //task1
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            System.out.println(bird);
            bird.fly();
            System.out.println();
        }
        //task2
        Employee employee = new Employee("Ann", 23, 300);
        Employee employeeDev = new Developer("Karl", 40, 800,"web-dev");

        System.out.println(employee.report());
        System.out.println(employeeDev.report());
    }
}

