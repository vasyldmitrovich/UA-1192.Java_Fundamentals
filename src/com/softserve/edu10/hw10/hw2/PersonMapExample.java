package com.softserve.edu10.hw10.hw2;

import java.util.HashMap;
import java.util.Map;

public class PersonMapExample {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Doe", "Jane");
        personMap.put("Brown", "Michael");
        personMap.put("Johnson", "Emily");
        personMap.put("White", "Chris");
        personMap.put("Davis", "Anna");
        personMap.put("Miller", "Orest");
        personMap.put("Wilson", "John");
        personMap.put("Moore", "Emma");
        personMap.put("Taylor", "David");

        System.out.println("Original Map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        boolean duplicateFirstName = PersonMapUtils.hasDuplicateFirstName(personMap);
        System.out.println("\nAre there at least two persons with the same first name? " + duplicateFirstName);

        PersonMapUtils.removePersonByFirstName(personMap, "Orest");

        System.out.println("\nMap after removing the person with the first name 'Orest':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
