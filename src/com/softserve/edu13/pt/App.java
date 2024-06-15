package com.softserve.edu13.pt;

import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.time.*;
import java.util.Random;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        System.out.println("=".repeat(20) + "Task 1" + "=".repeat(20));
        task1();
        System.out.println("=".repeat(20) + "Task 2" + "=".repeat(20));
        task2();
        System.out.println("=".repeat(20) + "Task 3" + "=".repeat(20));
        task3();
        System.out.println("=".repeat(20) + "Task 4" + "=".repeat(20));
        task4();
    }

    public static void task1() {
        String today = LocalDate.now().getDayOfWeek().name();
        System.out.println("Today is " + today.toLowerCase());
    }

    public static void task2() {
        LocalDate firstDay = LocalDate.now().withDayOfMonth(1);
        LocalDate firstMonday = firstDay.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println("First monday in this month had date: " + firstMonday);
    }

    public static void task3() {
        List<String> listTask3 = new ArrayList<>(List.of("Emily", "Bob", "Charlie", "William", "Karl", "Leonardo"));
        List<String> sortedListTask3 = listTask3.stream().sorted().toList();
        System.out.println(sortedListTask3);
    }

    public static void task4() {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = rnd.nextInt(0, 100);
        }
        System.out.println("Array: " + Arrays.toString(arr));
        int count = count(arr, x -> x > 40);
        if (count == 0) {
            System.out.println("There is no element that satisfy condition.");
        } else {
            System.out.println("Elements that satisfy condition: " + count);
        }


    }

    public static int count(int[] arr, Predicate<Integer> predicate) {
        int count = 0;
        for (int num : arr) {
            if (predicate.test(num)) {
                count++;
            }
        }
        return count;
    }
}
