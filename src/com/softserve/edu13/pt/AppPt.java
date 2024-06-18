package com.softserve.edu13.pt;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppPt {
    public static final Random random = new Random();

    public static void main(String[] args) {// Ok
        System.out.println("-".repeat(20) + "First practical task" + "-".repeat(20));
        pt1();
    }

    public static void pt1() {
        LocalDate localDate = LocalDate.now();
        System.out.println("• Show which today is a day of a week");
        getDayOfWeek(localDate);
        System.out.println("\n• Show a date of first Monday for current month");
        getFirstMonday(localDate);
        System.out.println("\n• Write a method for sorting list of Strings using Java 8");
        sortJ8();
        System.out.println("\n• Count task");
        checkCountTask();


    }

    private static void getDayOfWeek(LocalDate localDate) {
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("Current date:" + localDate + "\nToday is " + dayOfWeek.toString().toLowerCase());

    }

    private static void getFirstMonday(LocalDate localDate) {
        TemporalAdjuster nextMonday = TemporalAdjusters.next(DayOfWeek.MONDAY);
        System.out.println("Data of first Monday for current month:" + localDate.with(nextMonday));
    }

    public static void sortJ8() {
        List<String> stringList = Arrays.asList("Third", "Second", "First", "Akunamatata");
        System.out.println("Start list:" + stringList);

        List<String> sortedList = stringList.stream()
                .sorted()
                .toList();
        System.out.println("Sorted list:" + sortedList);
    }

    private static void checkCountTask() {
        int[] numb = createArray(10);
        System.out.println("Conditional:Numbers > 0");
        int count1 = (count(numb, n -> n > 0));
        System.out.println("\nCount of numbers: " + count1);
        System.out.println("Conditional:Numbers %2 == 0");
        int count = count(numb, n -> n % 2 == 0);
        System.out.println("\nCount of numbers:" + count);
    }

    public static int count(int[] array, Predicate<Integer> predicate) {
        int count = 0;
        System.out.print("Numbers that meet the condition:");
        for (int number : array) {
            if (predicate.test(number)) {
                count++;
                System.out.print(number + " ");
            }
        }
        return count;
    }

    public static int[] createArray(int n) {
        int[] numb = new int[n];
        for (int i = 0; i < n; i++) {
            numb[i] = random.nextInt(-100, 100);
        }
        System.out.println("Created array: " + Arrays.toString(numb) + "\n");

        return numb;
    }

}
