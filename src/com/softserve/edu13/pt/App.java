package com.softserve.edu13.pt;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
        task2();

//        System.out.println("Demonstrate task 3");
//        task3();

        System.out.println("Demonstrate task 4");
        task4();
    }

    public static void task1() {
        System.out.println("Day of week " + LocalDate.now().getDayOfWeek().name());
    }

    public static void task2() {
        LocalDate today = LocalDate.now();

        LocalDate firstDayOfMonth = today.withDayOfMonth(1);

        int daysToAdd = (DayOfWeek.MONDAY.getValue() - firstDayOfMonth.getDayOfWeek().getValue() + 7) % 7;

        LocalDate firstMonday = firstDayOfMonth.plusDays(daysToAdd);

        System.out.println("First monday of current month: " + firstMonday);
    }

    public static void task3() {
        List<String> list = new ArrayList<>(List.of("java", "python", "php", "ruby", "javascript"));

        List<String> sortedList = list.stream().sorted().toList();

        System.out.println(sortedList);
    }

    public static void task4() {
        Random random = new Random();

        int[] array = random.ints(10, 0, 110).toArray();

        long evenNumbers = count(array, (value ->  value % 2 == 0));

        System.out.println("Generated array: " + Arrays.toString(array));
        System.out.println("Even numbers quantity: " + evenNumbers);
    }

    public static long count(int[] arr, IntPredicate predicate) {
        return Arrays.stream(arr).filter(predicate).count();
    }
}
