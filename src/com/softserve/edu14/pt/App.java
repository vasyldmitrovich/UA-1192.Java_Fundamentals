package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        System.out.println("=".repeat(20) + "Task 1" + "=".repeat(20));
        task1();
        System.out.println("=".repeat(20) + "Task 2" + "=".repeat(20));
        task2();
    }

    public static void task1() {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long emptyStringsCount = list.stream().filter(String::isEmpty).count();
        System.out.println("Amount of empty strings: " + emptyStringsCount);
        List<String> listWithoutEmptyS = list.stream().filter(s -> !s.isEmpty()).toList();
        System.out.println("List without empty strings: " + listWithoutEmptyS);
        String joinedStrings = listWithoutEmptyS.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("String in uppercase separated by comas: " + joinedStrings);

    }

    public static void task2() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics statistics = primes.stream().mapToInt(i -> i).summaryStatistics();
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Min: " + statistics.getMin());
        System.out.println("Max: " + statistics.getMax());
        System.out.println("Sum: " + statistics.getSum());

    }
}
