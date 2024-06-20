package com.softserve.edu10.hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapOperations {// Good

    public Map<String, String> createAndPopulateMap() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Shevchenko ", "Taras");
        personMap.put("Franko ", "Ivan");
        personMap.put("lesya", "Ukrainka");
        personMap.put("Skovoroda", "Grigory");
        personMap.put("Kocubunsky", "Mikhailo");
        personMap.put("Nechuy-Levucky", "Ivan");
        personMap.put("Kulish", "Panteleymon");
        personMap.put("Dovzhenko", "Olekasndr");
        personMap.put("Stus", "Vasyl");
        return personMap;
    }

    public void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Last Nmae: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public boolean hasDuplicateFirstNames(Map<String, String> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : map.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }
        for (int count : firstNameCount.values()) {
            if (count > 1) {
                return true;
            }
        }
        return false;
    }

    public void removePersonByName(Map<String, String> map, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstName)) {
                iterator.remove();
            }
        }
    }
}
