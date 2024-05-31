package com.softserve.edu07.pt07.task2;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Student("Катерина"),
                new Teacher("Петро"),
                new Cleaner("Марія")
        };

        for (Person person : people) {
            person.print();
        }

        for (Person person : people) {
            if (person instanceof Staff) {
                Staff staff = (Staff) person;
                System.out.println("Зарплата: " + staff.salary());
            }
        }
    }
}
