package com.softserve.edu10.hw10.hw2;

import java.util.HashMap;
import java.util.Map;

public class PersonMapUtils {

    public static boolean hasDuplicateFirstName(Map<String, String> map) {
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

    public static void removePersonByFirstName(Map<String, String> map, String firstName) {
        String keyToRemove = null;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(firstName)) {
                keyToRemove = entry.getKey();
                break;
            }
        }
        if (keyToRemove != null) {
            map.remove(keyToRemove);
        }
    }
}
