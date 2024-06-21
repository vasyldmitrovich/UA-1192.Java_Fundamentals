package com.softserve.edu09_10_collec.hw_10;

import java.util.HashMap;
import java.util.Map;

public class Hw_02 {
    public static void main(String... args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Teliatnyk", "Anastasia");
        personMap.put("Popel", "Alla");
        personMap.put("Markanova", "Emma");
        personMap.put("Denys", "Olha");
        personMap.put("Semonenko", "Mirana");
        personMap.put("Kvitkova", "Alla");
        personMap.put("Kukharskyy", "Orest");
        personMap.put("Ponomenko", "Orest");
        personMap.put("Koma", "Iryna");
        personMap.put("Karpova", "Kateryna");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        boolean sameNames = personMap.values().stream().distinct().count() < personMap.size();

        if (sameNames) {
            System.out.println("Are there at least two persons with the same first name.");
        } else {
            System.out.println("No duplicate names found.");
        }

        personMap.values().removeIf(name -> name.equals("Orest"));

        System.out.println("PersonMap after removing:");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
