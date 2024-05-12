package com.softserve.edu06.hw;

import com.softserve.edu06.hw.bird.*;

import java.util.Random;

public class App {

    public static final Random RAND = new Random(System.currentTimeMillis());

    private static final String[] NAMES = {"Andrew", "Viktor", "Taras", "Oleg"};
    private static final String[] POSITIONS = {"Java Developer", "Python Developer", "QA Engineer"};

    public static void main(String[] args) {
        System.out.println("Task 1");
        demonstrateBirdTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateEmployeeTask();
    }

    private static void demonstrateBirdTask() {
        Bird[] birds = new Bird[10];
        for (int i = 0; i < birds.length; i++) {
            int birdType = RAND.nextInt(4);

            switch (birdType) {
                case 0 -> birds[i] = new Eagle();
                case 1 -> birds[i] = new Swallow();
                case 2 -> birds[i] = new Penguin();
                case 3 -> birds[i] = new Kiwi();
            }

            birds[i].fly();
        }
    }

    private static void demonstrateEmployeeTask() {
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            String name = NAMES[RAND.nextInt(NAMES.length)];
            //from 18 to 60
            int age = RAND.nextInt(42) + 18;
            //from 12000 to 50000 uah
            double salary = RAND.nextDouble(38000) + 12000;

            if (RAND.nextBoolean()) {
                employees[i] = new Employee(name, age, salary);
            } else {
                String position = POSITIONS[RAND.nextInt(POSITIONS.length)];
                employees[i] = new Developer(name, age, salary, position);
            }

            //change to toString()
            System.out.println(employees[i].report());
        }
    }
}
