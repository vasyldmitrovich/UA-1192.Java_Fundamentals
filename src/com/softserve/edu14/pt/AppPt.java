package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AppPt {
    public static String TWENTYRISKS = "-".repeat(20);

    public static void main(String[] args) {// Good
        System.out.println(TWENTYRISKS + " First practical task " + TWENTYRISKS);
        pt1();
        System.out.println(TWENTYRISKS + " Second practical task " + TWENTYRISKS);
        pt2();
    }

    public static void pt1() {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");

        long countEmpty = countEmpty(list);
        System.out.println("Count empty strings in the list:" + countEmpty);

        List<String> filteredList = filterList(list);
        System.out.println("List without empty elements: " + filteredList);

        String strList = convertToUpperString(list);
        System.out.println("String to uppercase and Join them with coma: " + strList);
    }

    public static long countEmpty(List<String> list) {
        return list.stream()
                .filter(String::isEmpty).count();
    }

    public static List<String> filterList(List<String> list) {
        return list.stream()
                .filter(str -> !str.isEmpty())
                .toList();
    }

    public static String convertToUpperString(List<String> list) {
        return list.stream()
                .filter(str -> !str.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
    }

    public static void pt2() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics summaryStatistics = primes.stream()
                .mapToInt(Integer::valueOf)
                .summaryStatistics();
        System.out.println("Count of numbers:" + summaryStatistics.getCount());
        System.out.println("Min value:" + summaryStatistics.getMin());
        System.out.println("Max value:" + summaryStatistics.getMax());
    }
}
