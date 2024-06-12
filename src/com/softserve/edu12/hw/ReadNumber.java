package com.softserve.edu12.hw;

import java.util.Scanner;

public class ReadNumber {
    static int readNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number <= start || number >= end) {
                throw new Exception("Number out of range. Please enter a number between " + (start + 1) + " and " + (end - 1) + ".");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new Exception("Invalid input. Please enter a valid integer.");
        }
    }
}