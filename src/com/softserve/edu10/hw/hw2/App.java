package com.softserve.edu10.hw.hw2;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        PersonMap personsHelper = new PersonMap();
        Map<String, String> personMap = personsHelper.createPersonMap();
        personsHelper.showMap(personMap);
        personsHelper.checkNames(personMap);
        personsHelper.removeDupName(personMap, "Orest");
    }
}
