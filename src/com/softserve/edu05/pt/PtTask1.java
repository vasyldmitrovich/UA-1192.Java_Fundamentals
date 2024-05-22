package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class PtTask1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String... args) {// Good
        String[] names = {"Jack", "Anastasiia", "Anna", "Maxym"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        double[] numbers = {1, 2, 3, 4, 5, 6};
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("The average value is " + average);

        System.out.println("Please enter name to search: ");
        String nameToSearch = SCANNER.nextLine();
        boolean found = false;
        for (var name : names) {
            if (name.equals(nameToSearch)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The name " + nameToSearch + " is on a list");
        } else {
            System.out.println("The name " + nameToSearch + " is not found");
        }
    }
}
