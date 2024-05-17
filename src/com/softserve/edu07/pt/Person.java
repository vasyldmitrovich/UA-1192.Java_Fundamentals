package com.softserve.edu07.pt;

abstract class Person {
    String name;
    final String TYPE_PERSON;

    public Person(String name, String typePerson) {
        this.name = name;
        this.TYPE_PERSON = typePerson;
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    abstract void print();
}

abstract class Staff extends Person {
    public Staff(String name, String typePerson) {
        super(name, typePerson);
    }

    abstract double salary();
}

class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name, TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am a Teacher.");
    }

    @Override
    double salary() {
        return 5000;
    }
}

class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name, TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am a Cleaner.");
    }

    @Override
    double salary() {
        return 2000; // Приклад значення зарплати
    }
}

class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name, TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am a Student.");
    }
}

    class main {
    public static void main(String[] args) {
        Person[] people = new Person[5];


        people[0] = new Teacher("Alice");
        people[1] = new Teacher("Bob");
        people[2] = new Cleaner("Charlie");
        people[3] = new Cleaner("David");
        people[4] = new Student("Eve");


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
