package com.softserve.edu10.hw.hw2;

import java.util.Map;

public class Persons {// Rename class to App
    public static void main(String[] args) {
        PersonsHelper personsHelper = new PersonsHelper();
        Map<String, String> personMap = personsHelper.createPersonMap();
        personsHelper.showMap(personMap);
        personsHelper.checkNames(personMap);
        personsHelper.removeDupName(personMap, "Evans");
    }


}
