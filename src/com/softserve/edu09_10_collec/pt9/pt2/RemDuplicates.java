package com.softserve.edu09_10_collec.pt9.pt2;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemDuplicates {
    public static final Scanner SCANNER = new Scanner(System.in);

    // Method to read input from the user
    public String input() {
        System.out.print("Enter a set of numbers separated by commas: ");
        String numbers = SCANNER.nextLine();
        System.out.println("Your numbers: " + numbers);
        return numbers;
    }

    // Method to split the input string into an array of numbers
    public String[] inputToArray(String string) {
        return string.split(",\\s*");
    }

    // Method to remove duplicate numbers using a Set
    public Set<String> noRepeats(String[] numbers) {
        Set<String> noRepeats = new HashSet<>(List.of(numbers));
        return noRepeats;
    }

    // Method to print the result to the console
    public void outputResult(Set<String> noRepeats) {
        System.out.println("Your numbers without duplicates: " + noRepeats);
    }
}


