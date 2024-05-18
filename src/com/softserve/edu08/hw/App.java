package com.softserve.edu08.hw;

public class App {
    public static void main(String[] args) {

        System.out.println("Demonstrate task 1");
        task1();
    }

    public static void task1() {
        Person[] people = {
                new Student(new FullName("Jack", "Johnson"), 18, 1),
                new Student(new FullName("Jane", "Jones"), 22, 4),
        };

        Person person = people[0].clone();
        person.setAge(21);

        for (Person p : people) {
            System.out.println(p.info());
            System.out.println(p.activity());
            System.out.println();
        }


        System.out.println(people[0].getFullName().getFirstName() + " " + people[0].getFullName().getLastName() + " clone");
        System.out.println(person.info());
    }
}
