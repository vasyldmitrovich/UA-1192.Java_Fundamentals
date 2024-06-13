package com.softserve.edu09_10_collec.hw10.hw2;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    private Map<String, Person> personMap;

    public PersonMap() {
        personMap = new HashMap<>();
    }

    public void addPerson(String lastName, String firstName) {
        Person person = new Person(lastName, firstName);
        personMap.put(lastName, person);
    }

    public void displayMap() {
        if (personMap.isEmpty()) {
            System.out.println("Person map is empty.");
        } else {
            System.out.println("Person Map:");
            for (Person person : personMap.values()) {
                System.out.println(person);
            }
        }
    }

    public boolean hasDuplicateFirstName(String firstName) {
        for (Person person : personMap.values()) {
            if (person.getFirstName().equals(firstName)) {
                return true;
            }
        }
        return false;
    }

    public void removePersonByFirstName(String firstName) {
        personMap.values().removeIf(person -> person.getFirstName().equals(firstName));
    }
}

