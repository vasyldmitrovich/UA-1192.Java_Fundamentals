package com.softserve.edu07.pt;

public class App {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat(),
        };

        for (Animal animal : animals) {
            animal.feed();
            animal.voice();
            System.out.println();
        }
    }

    public static void task2() {
        Person[] people = {
                new Student(),
                new Teacher(),
                new Cleaner(),
                new Student(),
                new Cleaner(),
        };

        for (Person person : people) {
            person.print();
            if (person instanceof Teacher || person instanceof Cleaner) {
                ((Staff) person).salary();
            }
            System.out.println();
        }
    }
}
