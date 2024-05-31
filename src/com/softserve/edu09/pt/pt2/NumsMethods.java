package com.softserve.edu09.pt.pt2;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NumsMethods {
    public static final Scanner SCANNER = new Scanner(System.in);

    public String input() {
        System.out.print("Enter 10 numbers on one line. \nSeparate them with commas:");
        String numbers = SCANNER.nextLine();
        System.out.print("Your numbers: " + numbers);
        return numbers;
    }

    public String[] inputToArray(String string) {
        String[] strings = string.split(",");
        return strings;
    }

    public Set<String> noRepeats(String[] numbers) {
        Set<String> noRepeats = new HashSet<>(List.of(numbers));

        System.out.println("\nYour numbers without same elements: " + noRepeats);
        return noRepeats;
    }

    public Set<String> findDups(String[] numbers) {
        boolean check = true;
        Set<String> noDups = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!noDups.add(numbers[i])) {
                System.out.println("Duplicate detected: " + numbers[i]);
                check = false;
            }
        }
        if (check) {
            System.out.println("\nNo duplicates");
        }
        return noDups;
    }
}

