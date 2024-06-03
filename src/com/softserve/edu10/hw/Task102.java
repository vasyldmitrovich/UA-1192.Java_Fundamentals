package com.softserve.edu10.hw;

import java.util.*;

public class Task102 {

    public static void execute() {

        Map<String, String> personMap = create(10);
        System.out.println("Initial map: " + personMap);
        String duplicate = getDuplicate(personMap);
        System.out.println("First duplicate is: " + duplicate);
        System.out.println("Lets remove first duplicate: " + removeByVal(duplicate, personMap));

    }

    private static Map<String, String> create(int number) {
        String[] firstNames = new String[]{"James", "Michael", "Robert", "John", "David", "William", "Richard",
                "Mary", "Patricia", "Jenifer", "Linda", "Elizabeth", "Barbara", "Susan"};
        String[] lastNames = new String[]{"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Theta", "Omicron", "Sigma", "Tau", "Iota", "Mu", "Omega"};
        Random random = new Random();
        Map<String, String> names = new HashMap<>();

        while (names.size() < number) {
            names.put(lastNames[random.nextInt(0, lastNames.length - 1)], firstNames[random.nextInt(0, firstNames.length - 1)]);

        }

        return names;
    }


    private static boolean hasDuplicate(Map<String, String> map) {
        Set<String> firstNames = new HashSet<>(map.values());

        return (firstNames.size() != map.size());
    }


    private static String getDuplicate(Map<String, String> map) {
        Set<String> names = new HashSet<>();

        if (hasDuplicate(map)) {
            for (Map.Entry<String, String> element : map.entrySet()) {
                if (!names.add(element.getValue())) {
                    return element.getValue();
                }
            }
        }
        return "There are no duplicates";
    }


    private static Map<String, String> removeByVal(String val, Map<String, String> map) {
        Map<String, String> modified = new HashMap<>();

        map.forEach((lastName, name) -> {
            if (!name.equals(val)) {
                modified.put(lastName, name);
            }
        });

        return modified;
    }
}
