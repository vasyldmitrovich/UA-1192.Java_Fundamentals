package com.softserve.edu08.hw;

import java.util.Random;

public class App {// Nice

    private static final Random RAND = new Random(System.currentTimeMillis());
    private static final String[] FIRST_NAMES = {"James", "Henry", "Emma", "William", "Evelyn"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Brown", "Miller", "Garcia"};

    public static void main(String[] args) {
        Person[] persons = new Person[3];

        try {
            persons[0] = generateStudent();
            persons[1] = generateStudent();
            persons[2] = persons[0].clone();
            ((Student) persons[2]).setCourse(1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        for (Person person : persons) {
            if (person != null) {
                System.out.println(person.info());
                System.out.println(person.activity());
                System.out.println();
            }
        }
    }

    private static Student generateStudent() {
        String fName = FIRST_NAMES[RAND.nextInt(FIRST_NAMES.length)];
        String lName = LAST_NAMES[RAND.nextInt(LAST_NAMES.length)];
        FullName fullName = new FullName(fName, lName);

        int age = RAND.nextInt(4) + 20;
        int course = 4 - (23 - age);
        return new Student(fullName, age, course);
    }

}
