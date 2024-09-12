package com.softserve.edu13.pt13;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.Arrays;

@FunctionalInterface
interface Condition {
    boolean test(int number);
}

public class pt1234 {// Name of class
    public static void main(String[] args) {
        // 1.
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Today is: " + dayOfWeek);

        // 2.
        LocalDate firstMonday = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("First Monday of the month is: " + firstMonday);

        // 3.
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");
        strings.sort(String::compareTo);
        System.out.println("Sorted strings: " + strings);

        // 4.
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = count(array, n -> n % 2 == 0); // Count even numbers
        System.out.println("Count of even numbers: " + count);
    }

    public static int count(Integer[] array, Condition condition) {
        int count = 0;
        for (int number : array) {
            if (condition.test(number)) {
                count++;
            }
        }
        return count;
    }
}
