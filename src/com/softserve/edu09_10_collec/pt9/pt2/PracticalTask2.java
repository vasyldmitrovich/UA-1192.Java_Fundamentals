package com.softserve.edu09_10_collec.pt9.pt2;
import java.util.Set;

public class PracticalTask2 {
    public static void main(String[] args) {
        RemDuplicates rd = new RemDuplicates();

        // Read input from the user
        String numbers = rd.input();

        // Convert the input string to an array
        String[] inputtedNumbers = rd.inputToArray(numbers);

        // Remove duplicate numbers
        Set<String> noRepeats = rd.noRepeats(inputtedNumbers);

        // Output the result to the console
        rd.outputResult(noRepeats);
    }
}

