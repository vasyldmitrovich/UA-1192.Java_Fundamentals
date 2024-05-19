package com.softserve.edu07_oop2.pt;

public class App {

    public static void main(String[] args) {

//        task1();
        task2();

    }

    public static void task1() {

        System.out.println("Task 1");

        Animal[] animals = {
                new Cat(),
                new Dog(),
        };

        for (var animal : animals) {
            animal.voice();
            animal.feed();

        }
    }

    public static void task2() {
        System.out.println("Task 2");

        Person[] people = {
                new Cleaner("Steeve"),
                new Cleaner("Tamara"),
                new Teacher("Mila"),
                new Teacher("Den"),
                new Student("Alex"),
                new Student("Olga")


        };


        for (var person : people) {
            person.print();

            if(person instanceof Staff staff) {
                System.out.println("Salary on his position is " + staff.salary());
            }
        }
    }
}
