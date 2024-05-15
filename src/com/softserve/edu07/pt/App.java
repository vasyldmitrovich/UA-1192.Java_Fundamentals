package com.softserve.edu07.pt;

import com.softserve.edu07.pt.animal.Animal;
import com.softserve.edu07.pt.animal.Cat;
import com.softserve.edu07.pt.animal.Dog;
import com.softserve.edu07.pt.job.*;

import java.util.Random;

public class App {

    private static final Random RAND = new Random(System.currentTimeMillis());
    private static final String[] FOOD = {"meat", "apple", "chicken", "tomato", "fish", "milk"};
    private static final String[] NAMES = {"Nick", "Rosaline", "Mike", "Shone", "Elizabeth"};

    public static void main(String[] args) {
        System.out.println("Task 1");
        demonstrateAnimalTask();
        System.out.println();

        System.out.println("Task 2");
        demonstratePersonTask();
    }

    private static void demonstrateAnimalTask() {
        Animal[] animals = generateAnimals(3);

        for (Animal animal : animals) {
            String food = FOOD[RAND.nextInt(FOOD.length)];

            animal.voice();
            animal.feed(food);
            System.out.println();
        }
    }

    private static Animal[] generateAnimals(int length) {
        Animal[] animals = new Animal[length];

        for (int i = 0; i < animals.length; i++) {
            if (RAND.nextBoolean()) {
                animals[i] = new Cat("Cat" + i);
            } else {
                animals[i] = new Dog("Dog" + i);
            }
        }

        return animals;
    }

    private static void demonstratePersonTask() {
        Person[] persons = generatePersons(6);

        for (Person person : persons) {
            person.print();

            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
            System.out.println();
        }
    }

    private static Person[] generatePersons(int length) {
        Person[] persons = new Person[length];

        for (int i = 0; i < persons.length; i++) {
            int variant = RAND.nextInt(4);
            String name = NAMES[RAND.nextInt(NAMES.length)];

            if (variant == 0) {
                persons[i] = new Student(name);
            } else {
                double salary = RAND.nextDouble(10000) + 10000;

                if (variant == 1) {
                    persons[i] = new Teacher(name, salary);
                } else {
                    persons[i] = new Cleaner(name, salary);
                }
            }
        }

        return persons;
    }
}
