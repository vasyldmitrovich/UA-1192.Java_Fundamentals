package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        practicalTask1();
        System.out.println("End of the first practical task");

        practicalTask2();
        System.out.println("End of the second practical task");
    }

    public static void practicalTask1() {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "sec", "blablabla");
        System.out.println("It is " + list.stream().filter(String::isEmpty).count() + " empty strings in list");

        list = list.stream().filter(item -> !item.isEmpty()).collect(Collectors.toList());
        System.out.println("List with removed empty strings" + "\n" + list.toString());

        String joinedWithComma = list.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println("Converted string to uppercase and joined them with comma is: " + "\n" + joinedWithComma);
    }

    public static void practicalTask2() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("The count of numbers in the list is: " + primes.stream().count());
        System.out.println("The min value in the list is: " + primes.stream().min(Integer::compareTo).get());
        System.out.println("The max value in the list is: " + primes.stream().max(Integer::compareTo).get());
        System.out.println("The sum of numbers in the list is: " + primes.stream().reduce(Integer::sum).get());
    }
}
