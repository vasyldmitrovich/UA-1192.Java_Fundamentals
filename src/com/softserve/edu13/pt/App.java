package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        //pt1
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        DayOfWeek dayOfWeek = today.getDayOfWeek();

        System.out.println("Local date " + today);
        System.out.println("Now is " + dayOfWeek + " " + now + "\n\n");

        //pt2
        List<String> stringList = Arrays.asList("apple", "orange", "banana", "grape");
        System.out.println("Non sorted list: " + stringList);
        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list: " + sortedList + "\n\n");

        //pt3
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int countEven = count(numbers, n -> n % 2 == 0);
        int countGreaterThan5 = count(numbers, n -> n > 5);

        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of numbers greater than 5: " + countGreaterThan5);
    }

    public static int count(Integer[] array, Predicate<Integer> condition) {
        return (int) Arrays.stream(array).filter(condition).count();
    }
}