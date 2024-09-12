package com.softserve.edu09.pt09.task2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        String[] numbers = input.split(",\\s*");// This is good

        Set<String> uniqueNumbers = new HashSet<>();


        for (String number : numbers) {
            uniqueNumbers.add(number.trim());
        }

        StringBuilder result = new StringBuilder();
        for (String number : uniqueNumbers) {
            result.append(number).append(", ");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        System.out.println("Result: " + result.toString());
    }
}
