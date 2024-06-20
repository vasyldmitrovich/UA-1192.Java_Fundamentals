package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {// Ok
        List<String> list = Arrays.asList("bla", "", "simp", "second", "third", "third", "sec", "blablabla");

        long emptyStringCount = list.stream().filter(String::isEmpty).count();
        System.out.println("Number of empty strings: " + emptyStringCount);

        List<String> filteredList = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("List after removing empty strings: " + filteredList);

        String joinedUpperCaseStrings = filteredList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Uppercase strings joined with comma: " + joinedUpperCaseStrings);
    }
}