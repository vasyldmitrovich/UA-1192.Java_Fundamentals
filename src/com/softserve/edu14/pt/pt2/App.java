package com.softserve.edu14.pt.pt2;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        long count = primes.size();
        int min = primes.stream().min(Integer::compareTo).orElse(0);
        int max = primes.stream().max(Integer::compareTo).orElse(0);
        int sum = primes.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Count: " + count);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
    }
}

