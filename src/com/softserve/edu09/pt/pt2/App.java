package com.softserve.edu09.pt.pt2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a set of numbers separated by commas (1, 2, 3, 4, 4, 5, 6, 6, 7, 8):");
        String input = scanner.nextLine();

        String[] numbers = input.split(",\\s*");

        ArrayList<String> uniqueNumbers = new ArrayList<>();

        for (String number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }

        System.out.println("Result:");
        System.out.println(String.join(", ", uniqueNumbers));

        scanner.close();
    }
}
