package com.softserve.edu07.pt;


import com.softserve.edu07.pt.animals.Animal;
import com.softserve.edu07.pt.animals.Cat;
import com.softserve.edu07.pt.animals.Dog;
import com.softserve.edu07.pt.persons.*;

public class PracticalTask {

    public void task1() {
        Animal[] animals = {
                new Cat(),
                new Dog(),

        };
        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }

    public void task2() {
        Person[] persons = {
                new Student("Alex"),
                new Cleaner("Sergio"),
                new Teacher("Iryna"),
                new Teacher("Natalia")

        };
        for (Person person : persons) {
            person.print();
            if (person instanceof Staff) {
                System.out.println("Salary is " + ((Staff) person).salary());
            }
        }
    }
}

