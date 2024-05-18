package com.softserve.edu06.hw;

import com.softserve.edu06.hw.bird.*;
import com.softserve.edu06.hw.company.Developer;
import com.softserve.edu06.hw.company.Employee;

public class HomeWorkTask {

    public void task1() {
        Bird[] birdArr = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi(),
        };
        for (Bird bird : birdArr) {
            System.out.println(bird);
            bird.fly();

        }
    }

    public void task2() {
        Employee employee1 = new Employee("Alex", 30, 35000.2);
        Developer dev1 = new Developer("Iryna", 24, "Junior Java Developer", 29000.25);
        System.out.println(employee1.report());
        System.out.println(dev1.report());
    }
}
