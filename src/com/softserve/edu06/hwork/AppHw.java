package com.softserve.edu06.hwork;

import java.io.IOException;
import java.util.Scanner;

public class AppHw {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {// Ok
        task1();
        task2();
    }

    public static void task1() {
        Bird[] birds = {new Eagle(), new Kiwi(), new Penguin(), new Swallow()};

        for (Bird bird : birds) {
            System.out.println("Bird type: " + bird.getClass().getSimpleName());
            System.out.println("Feathers: " + bird.isFeathers());
            System.out.println("Lays eggs: " + bird.isLayEggs());
            bird.fly();
        }
    }

    public static void task2() {
        Employee employee = new Employee("Poma", 22, 2000);

        Developer developer = new Developer("Nastya", 22, 3000, "Java developer");

        System.out.println(employee.report());

        System.out.println(developer.report());
    }
}

