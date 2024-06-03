package com.softserve.edu07.pt;

import com.softserve.edu07.pt2.*;

public class AppPt {
    public static void main(String[] args) {

        //task1;

        task2();

        Animal[] animals = {
                new Cat(),
                new Dog()
        };
        for (var animal : animals) {
            animal.voice();
            animal.feed();
        }
        interface Animal {// What this interface do here???
            void voice();

            void feed();

        }
    }

    static void task2() {

                 Person[] persons = new Person[]{
                         new Teacher("Mary"),
                         new Student("Bob"),
                         new Cleaner("Jone"),
                 };

            for (var person : persons) {
                person.print();
                if (person instanceof Staff) {
                    Staff staff = (Staff) person;
                    System.out.println("My salary is " + staff.salary());
                }
            }
    }
}


