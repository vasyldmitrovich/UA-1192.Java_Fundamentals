package com.softserve.edu07.pt;

public class App {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        task1();
        System.out.println("Task 2:");
        task2();
    }

    public static void task1() {
        Animal[] animals = {
                new Cat(),
                new Dog()
        };
        for (var animal : animals) {
            animal.voice();
            animal.feed();
        }
    }

    public static void task2() {
        Person[] persons = {
                new Teacher("Rodrigo"),
                new Cleaner("Michael"),
                new Student("Frank")
        };
        for (var person : persons) {
            person.print();
            if (person instanceof Staff staff) {
                System.out.println("My salary is " + staff.salary());
            }
            System.out.println("=".repeat(50));
        }
    }

}
