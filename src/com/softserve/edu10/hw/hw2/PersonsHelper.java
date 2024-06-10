package com.softserve.edu10.hw.hw2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonsHelper {
    public Map<String, String> createPersonMap() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Hemsworth", "Chriss");
        personMap.put("Chalamet", "Timothée");
        personMap.put("Cavill", "Henry");
        personMap.put("Washington", "Denzel");
        personMap.put("Pitt", "Brad");
        personMap.put("DiCaprio", "Leonardo");
        personMap.put("Hanks", "Tom");
        personMap.put("Downey Jr.", "Robert");
        personMap.put("Evans", "Chris");
        personMap.put("Jackman", "Hugh");
        return personMap;
    }

    public void showMap(Map<String, String> map) {
        System.out.println(map);
    }

    public void checkNames(Map<String, String> map) {
        Set<String> nameSet = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        boolean check = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!nameSet.add(entry.getValue())) {
                check = true;
                duplicates.add(entry.getValue());
                System.out.println("Obj with duplicate name is: (Key) " + entry.getKey() + " " + ("(Value) ") + entry.getValue());
                System.out.println("Duplicate name is: " + entry.getValue());
            }
        }
        if (!check) {
            System.out.println("No duplicates");
        }
    }

    public void removeDupName(Map<String, String> map, String key) {
        map.remove(key);
        System.out.println(map);
    }
}





