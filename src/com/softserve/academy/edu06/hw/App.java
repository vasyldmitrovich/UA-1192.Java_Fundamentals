package com.softserve.academy.edu06.hw;

import com.softserve.academy.edu06.hw.task_1.Bird;
import com.softserve.academy.edu06.hw.task_1.Eagle;
import com.softserve.academy.edu06.hw.task_1.Penguin;
import com.softserve.academy.edu06.hw.task_1.Swallow;
import com.softserve.academy.edu06.hw.task_2.Developer;
import com.softserve.academy.edu06.hw.task_2.Employee;

public class App {

    public static void main(String[] args) {
        task1();
        task2();
    }


    public static void task1() {
        System.out.println("Task 1:" +
                "        1. Create abstract class called Bird by scheme\n" +
                "          with attributes feathers and layEggs and an abstaract fly() method.\n");

        System.out.println("Task 2: Create classes FlyingBird and NonFlyingBird\n");

        System.out.println("Task 3: Create classes Eagle, Swallow, Penguin and Kiwi.\n");

        System.out.println("Task 4: In main() method create an array Bird and\n" +
                "add different birds to it. Call fly() method for\n" +
                "all of it. Output the information about each\n" +
                "type of created bird.\n");

        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true, true);
        birds[1] = new Swallow(true, true);
        birds[2] = new Eagle(true, true);
        birds[3] = new Penguin(true, true);
        for (Bird bird : birds) {
            bird.fly();
        }
    }

    public static void task2() {
        System.out.println("Task 2:" +
                "        Create a class called Developer that extends the Employee class. Define a String field\n" +
                "and a constructor to initialize all fields in the Developer class.\n" +
                "In the Developer class, override the report() method to return a string with information\n" +
                "about the developer, for example:\n" +
                "Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35\n" +
                "If necessary, modify the Employee class to adhere to the principles of encapsulation and\n" +
                "inheritance.\n" +
                "In main() method create an instance of both the Employee and Developer classes and\n" +
                "print information about them in the console using report() method.\n");

        Employee employee = new Employee("Taras", 32, 32735.35);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
