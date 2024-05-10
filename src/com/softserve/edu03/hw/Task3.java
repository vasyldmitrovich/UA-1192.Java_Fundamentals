package com.softserve.edu03.hw;

public class Task3 {// Ok
    public static void main(String[] args) {
        Person[] p = new Person[5];
        for (int i = 0; i < 5; i++) {
            p[i] = new Person();
            p[i].input();
        }
        for (Person person: p) {
            person.output();
        }

    }
}

