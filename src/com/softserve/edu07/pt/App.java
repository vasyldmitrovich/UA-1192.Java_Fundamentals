package com.softserve.edu07.pt;

public class App {
    public static void main(String[] args) {// Nice to see tasks is good

        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
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
        }
    }
}
