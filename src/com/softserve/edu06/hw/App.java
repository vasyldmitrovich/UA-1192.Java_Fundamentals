package com.softserve.edu06.hw;

public class App {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi(),
        };

        for (Bird bird : birds) {
            System.out.println(bird);
            bird.fly();
            System.out.println();
        }
    }

    public static void task2() {
        Employee[] employees = {
                new Employee("Alex", 22, 1440.33),
                new Employee("Jenifer", 23, 1530.21),
                new Developer("John", 30, 2000, "Full-stack developer"),
                new Developer("Julia", 28, 1100.13, "Java developer"),
        };

        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
