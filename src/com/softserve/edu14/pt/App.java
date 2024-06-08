package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        System.out.println("Task 1");
        demonstrateFirstTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateSecondTask();
    }

    private static void demonstrateFirstTask() {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second",
                "third", "third", "sec", "blablabla");
        int emptyStringsCount = (int) list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Empty strings count: " + emptyStringsCount);

        list = list.stream()
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Remove all empties: " + list);

        list = list.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
        System.out.println("Convert to upper case: " + list);
    }

    private static void demonstrateSecondTask() {
        List<Integer> primes = Arrays.asList (2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//        int count = (int) primes.stream().count();
        //Idea recommend replace it simplier
        int count = primes.size();
        System.out.println("Count of elements: " + count);

        Optional<Integer> min = primes.stream().min(Integer::compareTo);
        min.ifPresent(e -> System.out.println("Min: " + e));

        Optional<Integer> max = primes.stream().max(Integer::compareTo);
        max.ifPresent(e -> System.out.println("Max: " + e));

        Optional<Integer> sum = primes.stream().reduce(Integer::sum);
        sum.ifPresent(e -> System.out.println("Sum: " + e));
    }
}
