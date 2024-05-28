package com.softserve.edu07_oop2.pt02;

public class App {
    public static void main(String... args) {
        Person[] persons = {
                new Teacher("Roman"),
                new Cleaner("Oleksandr"),
                new Student("Anna")
        };
        for (var person : persons) {
            person.print();
            if (person instanceof Staff staff) {
                System.out.println("My salary is " + staff.salary());
            }
        }

    }
}
