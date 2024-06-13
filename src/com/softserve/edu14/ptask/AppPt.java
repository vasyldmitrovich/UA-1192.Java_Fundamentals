package com.softserve.edu14.ptask;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AppPt {
    public static void main(String[] args) {// Ok
        task1();
        task2();
    }

    public static void task1() {
        List<String> list = Arrays.asList("bla", "", "simp","", "second", "third", "third", "sec", "blablabla");
        System.out.println("List: " + list);

        long emptyString = list.stream().filter(String::isEmpty).count();
        System.out.println("Number of empty strings in the list: " + emptyString);

        List<String> filtered = list.stream().filter(string -> !string.isEmpty()).toList();
        System.out.println("List without empty strings: " + filtered);

        String mergedString = filtered.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("Merged string: " + mergedString);
    }

    public static void task2() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Primes count: " + stats.getCount());
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
    }
}
