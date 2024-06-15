package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class AppPt14 {
    private static List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
    private static List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

    public static void main(String[] args) {
        System.out.println("Perform practical task 14.1");
        task141(list);
        System.out.println();

        System.out.println("Perform practical task 14.2");
        task142(primes);
        System.out.println();



    }

    private static void task141(List<String> stings){
        if(stings == null)  return;

        long count = stings.stream().filter(s -> s.length() == 0).count();
        System.out.println("Empty strings number: " + count);

        List<String> filtered = stings.stream().filter(s -> s.length() != 0).toList();
        System.out.println("Strings without empty ones: " + filtered);

        String result = stings.stream().filter(s -> s.length() != 0).map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println("To upper case:" + result);

    }

    private static void task142(List<Integer> integers){
        if (integers == null) return;

        long count = integers.stream().count();
        System.out.println("Count of integers: " + count);
        Optional<Integer> min = integers.stream().min(Comparator.naturalOrder());
        System.out.println("Min value: " + min.get());
        Optional<Integer> max = integers.stream().max(Comparator.naturalOrder());
        System.out.println("Max value: " + max.get());
        long sum = integers.stream().reduce(0, Integer::sum);
        System.out.println("The sum is: " + sum);
    }


}
