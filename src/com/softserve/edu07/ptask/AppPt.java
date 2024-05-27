package com.softserve.edu07.ptask;

import java.io.IOException;
import java.util.Scanner;

public class AppPt {
        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            task1();
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
                    new Teacher("Anna"),
                    new Cleaner("Dora"),
                    new Student("Maria")
            };

            for (var person : persons) {
                person.print();
                if (person instanceof Staff staff) {
                    System.out.println("My salary is " + staff.salary());

                }
            }
    }
}
