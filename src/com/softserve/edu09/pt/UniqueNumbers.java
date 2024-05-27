package com.softserve.edu09.pt;

import java.util.*;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter numbers separated of comma:");

        String inputString = scanner.nextLine();

        scanner.close();

        inputString = inputString.replace(" ", "");

        String[] numbersArray = inputString.split(",");

        List<String> numbersList = new ArrayList<>();
        for (String num : numbersArray) {
            if (!num.isEmpty()) {
                numbersList.add(num);
            }
        }

        Set<String> uniqueNumbersSet = new HashSet<>(numbersList);

        List<String> uniqueNumbersList = new ArrayList<>(uniqueNumbersSet);

        Collections.sort(uniqueNumbersList);

        String resultString = String.join(", ", uniqueNumbersList);

        System.out.println("Unique numbers: " + resultString);
    }
}
