package com.softserve.edu03.hwork;

public class AppHw3 {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        for (int i = 0; i < 5; i++) {
            people[i] = new Person();
            people[i].input();
        }

        System.out.println("Information about people: ");
        for (Person person : people) {
            person.output();
            System.out.println();
        }
    }
}


