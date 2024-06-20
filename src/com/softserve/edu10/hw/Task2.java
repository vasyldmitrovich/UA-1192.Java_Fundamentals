package com.softserve.edu10.hw;

import java.util.Map;

public class Task2 {
    public static void main(String[] args) {// Good
        MapOperations mapOps = new MapOperations();
        Map<String, String> personMap = mapOps.createAndPopulateMap();

        System.out.println("begin map:");
        mapOps.printMap(personMap);

        boolean hasDuplicates = mapOps.hasDuplicateFirstNames(personMap);
        System.out.println(" thare are minimum 2 people who have same name ?" + hasDuplicates);

        mapOps.removePersonByName(personMap, "Oleksandr");

        System.out.println(" map after remove");
        mapOps.printMap(personMap);

    }
}
