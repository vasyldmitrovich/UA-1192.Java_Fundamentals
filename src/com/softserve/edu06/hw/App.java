package com.softserve.edu06.hw;

import com.softserve.edu06.hw.homework1.*;
import com.softserve.edu06.hw.homework2.Developer;
import com.softserve.edu06.hw.homework2.Employee;

public class App {

    public static void main(String[] args) {
        homework1();
        System.out.println("End of the first homework");

        homework2();
        System.out.println("End of the second homework");
    }

    public static void homework1() {
        Bird [] birds = new Bird[4];
        Eagle eagle = new Eagle();
        Swallow swallow = new Swallow();
        Penguin penguin = new Penguin();
        Kiwi kiwi = new Kiwi();

        birds[0] = eagle;
        birds[1] = swallow;
        birds[2] = penguin;
        birds[3] = kiwi;

        for (Bird item : birds) {
            System.out.println(item.toString());
            item.fly();
        }
    }

    public static void homework2() {
        Employee employee = new Employee("Ivan", 22, 15500.50);
        Developer developer = new Developer("Taras", 32,  32735.35, "Java Developer");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
