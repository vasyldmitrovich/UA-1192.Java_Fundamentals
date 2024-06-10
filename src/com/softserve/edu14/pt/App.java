package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
//        System.out.println("Task 1");
//        task1();

        System.out.println("Task 2");
        task2();
    }

    public static void task1() {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        long emptyStringsCount = list.stream().filter(String::isEmpty).count();

        System.out.println("Empty strings count: " + emptyStringsCount);

        System.out.println("List without empty strings");
        list.stream().filter(i -> !i.isEmpty()).forEach(i -> System.out.print(i + " "));

        System.out.println("\nList joined with comma");
        String result = list.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(result);
    }

    public static void task2() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics stats = primes.stream().collect(Collectors.summarizingInt(i -> i));

        System.out.println("Primes count: " + stats.getCount());
        System.out.println("Min value: " + stats.getMin());
        System.out.println("Max value: " + stats.getMax());
        System.out.println("Sum: " + stats.getSum());
    }
}
