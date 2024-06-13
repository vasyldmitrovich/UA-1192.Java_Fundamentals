package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;

public class App {

    private static final Random RAND = new Random(System.currentTimeMillis());
    private static final int MAX_STRING_LENGTH = 10;

    private static final int MIN_CHAR_ASCII = 65;
    private static final int MAX_CHAR_ASCII = 90;
    private static final int GAP_BETWEEN_CASES = 32;

    public static void main(String[] args) {// Very nice
        System.out.println("Task 1");
        demonstrateTodayTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateAdjusterTask();
        System.out.println();

        System.out.println("Task 3");
        demonstrateSortTask();
        System.out.println();

        System.out.println("Task 4");
        demonstrateCountTask();
    }

    private static void demonstrateTodayTask() {
        LocalDate today = LocalDate.now();
        System.out.println("Today is ");
        System.out.println(today);
    }

    private static void demonstrateAdjusterTask() {
        LocalDate today = LocalDate.now();
        TemporalAdjuster firstMondayOfMonth =
                TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        LocalDate firstMondayDate = today.with(firstMondayOfMonth);
        System.out.print("First Monday of " + today.getMonth() + " was ");
        System.out.println(firstMondayDate);
    }

    private static void demonstrateSortTask() {
        List<String> strings = generateStringList(10);
        System.out.println("String list: " + strings);
        List<String> sorted = strings.stream()
                .sorted(String::compareToIgnoreCase)
                .toList();
        System.out.println("Sorted list: " + sorted);
    }

    private static List<String> generateStringList(int length) {
        List<String> strings = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            strings.add(generateString());
        }

        return strings;
    }

    private static String generateString() {
        int length = RAND.nextInt(MAX_STRING_LENGTH) + 1;
        char[] chars = new char[length];

        for (int i = 0; i < chars.length; i++) {
            //from MIN_CHAR_ASCII to MAX_CHAR_ASCII both included
            char ch = (char) (RAND.nextInt(MAX_CHAR_ASCII - MIN_CHAR_ASCII + 1) + MIN_CHAR_ASCII);

            if (RAND.nextBoolean()) {
                ch += GAP_BETWEEN_CASES;
            }

            chars[i] = ch;
        }

        return String.valueOf(chars);
    }

    private static void demonstrateCountTask() {
        int[] integers = generateIntegerArray(10);
        System.out.println("Integer array: " + Arrays.toString(integers));
        long count = count(integers, e -> e % 2 == 0);
        System.out.println("Even values count: " + count);
    }

    private static long count(int[] numbers, IntPredicate predicate) {
        return Arrays.stream(numbers)
                .filter(predicate)
                .count();
    }

    private static int[] generateIntegerArray(int length) {
        int[] integers = new int[length];

        for (int i = 0; i < length; i++) {
            integers[i] = RAND.nextInt(200) - 100;
        }

        return integers;
    }

}
