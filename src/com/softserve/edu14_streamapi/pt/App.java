package com.softserve.edu14_streamapi.pt;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {


        task1();
        task2();


    }


    public static void task1() {

        System.out.println("Pt 14 task 1");

        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");


        long count = list.stream()
                .filter(String::isEmpty)
                .count();

        System.out.println("Quantity empty strings are in this list: " + count);


        List<String> filtered = list.stream()
                .filter(String -> !String.isEmpty())
                .collect(Collectors.toList());

        System.out.println(filtered);

        String toUppercase = list.stream()
                .filter(String -> !String.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        System.out.println(toUppercase);
    }

    public static void task2() {

        System.out.println("Pt 14 task 2");

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics stats = primes.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println(primes);
        System.out.println("Count: " + stats.getCount());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Sum: " + stats.getSum());


    }
}
