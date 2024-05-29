package com.softserve.edu06.hw;

import com.softserve.edu06.hw.hw1.*;
import com.softserve.edu06.hw.hw2.Developer;
import com.softserve.edu06.hw.hw2.Employee;

public class App {

    public static void main(String[] args) {
        task2();

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
    }





public static void task2() {


    Employee employee = new Employee("Anna", 23, 600);
    Employee employeeDev = new Developer("Jon", 30, 1000, "java-dev");
    System.out.println(employeeDev.report());
    System.out.println(employee.report());
}

            }
