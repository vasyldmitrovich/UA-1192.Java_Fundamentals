package com.softserve.academy.edu07.pt.task_1;

abstract class Person {
    protected String name;
    public static final String TYPE_PERSON = "Person";

    public Person(String name) {
        this.name = name;
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    public abstract void print();
}

abstract class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    public abstract double salary();
}

class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Teacher");
    }

    @Override
    public double salary() {
        return 5000.00; // Example salary
    }
}

class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Cleaner");
    }

    @Override
    public double salary() {
        return 2000.00; // Example salary
    }
}

class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Student");
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Teacher("Alice"),
                new Cleaner("Bob"),
                new Student("Charlie")
        };

        for (Person person : people) {
            person.print();
        }

        for (Person person : people) {
            if (person instanceof Staff) {
                Staff staff = (Staff) person;
                System.out.println(staff.name + "'s salary: " + staff.salary());
            }
        }
    }
}
