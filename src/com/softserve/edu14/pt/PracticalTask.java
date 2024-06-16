package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PracticalTask {

    public void task1() {

        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        System.out.println("Original list: " + list);

//      Print how many empty strings are in this list
        long count = list.stream()
                .filter(element -> element.isEmpty())
                .count();
        System.out.println("Number of empty strings is: " + count);

//      Remove all empty Strings from list and print the result
        List<String> newList = list.stream()
                .filter(element -> !element.isEmpty())
                .collect(Collectors.toList());
        System.out.println("List without empty: " + newList);

// Convert String to uppercase and Join them with coma. Print the result
        String str = newList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println("List converted to String: " + str);
    }

    public void task2() {

        //2. For given collection
//    List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//    calculate count, min, max, sum, for numbers and print all results
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x).summaryStatistics();
        System.out.println("Count is: " + stats.getCount());
        System.out.println("Min is: " + stats.getMin());
        System.out.println("Max is: " + stats.getMax());
        System.out.println("Sum of all is: " + stats.getSum());
    }

}
