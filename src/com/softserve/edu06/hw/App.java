package com.softserve.edu06.hw;

public class App {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        task1();
        System.out.println("Task 2:");
        task2();
    }

    public static void task1() {
        Bird[] birds = new Bird[4];
        birds[0] = new Penguin();
        birds[1] = new Eagle();
        birds[2] = new Kiwi();
        birds[3] = new Swallow();

        for (Bird bird : birds) {
            bird.fly();
            bird.printInformation();
            System.out.println("=".repeat(50));
        }
    }

    public static void task2() {
        Employee employee = new Employee("Dave", 24, 43000.40);
        Developer developer = new Developer("Jame", 27, 64000.30, "Middle java developer");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
