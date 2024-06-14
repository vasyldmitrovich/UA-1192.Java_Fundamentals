package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppPt13 {

    public static void main(String[] args) {
/*
Show which today is a day of a week
• Show a date of first Monday for current month
• Write a method for sorting list of Strings using Java 8
• Create array Integers which has 10 elements, create method count() that takes an array
of integers as the first parameter and functional interface as the second parameter,
that functional interface works with integers and defines a condition. Method count()
return count of elements in array that satisfy the condition defined by the second
argument.
 */
        System.out.println("Show which today is a day of a week");
        LocalDate date = LocalDate.now();
        System.out.println("Today is: " + date.getMonth() + " " + date.getDayOfMonth() + " - " + date.getDayOfWeek());
        System.out.println();

        System.out.println("Show a date of first Monday for current month");
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println("The date of first Monday for current month is " + date.with(firstMonInMonth));
        System.out.println();

        System.out.println("Write a method for sorting list of Strings using Java 8");
        List<String> strings = Arrays.asList("Strings".split(""));
        System.out.println("Unsorted strings list: " + strings);
        System.out.println("Sorted strings list: " + sortStrings(strings));
        System.out.println();

        System.out.println("Return count of elements that satisfy the condition");
        Random random = new Random();
        List<Integer> integers = Stream.generate(() -> random.nextInt(150)).limit(10).toList();
        Predicate<Integer> isEven = integer -> integer % 2 == 0;

        System.out.println("Integers list: " + integers);
        long result = count(integers, isEven);
        System.out.println("The number of even integers is: " + result);

    }

    public static List<String> sortStrings(List<String> strings) {
        return strings.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

    public static long count(List<Integer> integers, Predicate<Integer> condition){
        if(integers == null || integers.isEmpty()) return 0;

        return integers.stream().filter(condition).count();
    }
}
