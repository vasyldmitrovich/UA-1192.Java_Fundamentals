package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class PracticalTask {

    private static final Scanner SCANNER = new Scanner(System.in);

    public void task1() {

        //Show which today is a day of a week
        String dayOfWeek = LocalDate.now().getDayOfWeek().toString();
        System.out.println("Today is: " + dayOfWeek);
    }

    public void task2() {

        //Show a date of first Monday for current month
        LocalDate now = LocalDate.now();
        LocalDate firstMonday = now.withDayOfMonth(1);

        while (firstMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstMonday = firstMonday.plusDays(1);
        }
        System.out.println("The first Monday of the current month is: " + firstMonday);
    }

    public void task3() {

        // Write a method for sorting list of Strings using Java 8
        List<String> strings = Arrays.asList("Alex", "Sam", "John", "Andrii");
        List<String> sortedStrings = sortStrings(strings);
        System.out.printf("List before:" + strings + "\nList after: " + sortedStrings);
    }

    public void task4() {

        //• Create array Integers which has 10 elements, create method count() that takes an array
        //of integers as the first parameter and functional interface as the second parameter,
        //that functional interface works with integers and defines a condition. Method count()
        //return count of elements in array that satisfy the condition defined by the second
        //argument.
        int[] arrayNumbers = getArray("Enter arrays number: ");

        int countOfGreatZero = count(arrayNumbers, num -> num > 0);
        int countOfOdd = count(arrayNumbers, num -> num % 2 != 0);

        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("Quantity of numbers>0 is: " + countOfGreatZero);
        System.out.println("Quantity of odd numbers: " + countOfOdd);
    }

    private static List<String> sortStrings(List<String> strings) {
        return strings.stream()
                .sorted()
                .toList();
    }

    private int count(int[] array, Predicate<Integer> condition) {
        int count = 0;
        for (int num : array) {
            if (condition.test(num)) {
                count++;
            }
        }
        return count;
    }

    private int[] getArray(String prompt) {

        int[] arrayOfInt = new int[10];
        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.println(prompt + (i + 1));
            arrayOfInt[i] = SCANNER.nextInt();
        }
        return arrayOfInt;
    }
}
