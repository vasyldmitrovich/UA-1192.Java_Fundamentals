package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Task1 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.TAIWAN);
        System.out.println("today: " + dayName);

        LocalDate firstMonday = findFirstMondayOfMonth(today);
        System.out.println("data first monday of this month: " + firstMonday);

        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        strings.add("peach");
        strings.sort(String::compareTo);
        System.out.println("sorted lines:");
        strings.forEach(System.out::println);

        Integer[] numbers = {1, 5, 10, 15, 20, 25, 30, 35, 40, 45};
        int count = countElements(numbers, x -> x > 20);
        System.out.println("amount numbers biger than 1: " + count);
    }

    private static LocalDate findFirstMondayOfMonth(LocalDate currentDate) {
        LocalDate firstDayOfMonth = currentDate.withDayOfMonth(1);
        LocalDate current = firstDayOfMonth;
        while (current.getDayOfWeek() != DayOfWeek.MONDAY) {
            current = current.plusDays(1);
        }
        return current;
    }

    private static int countElements(Integer[] array, Predicate<Integer> condition) {
        int count = 0;
        for (int num : array) {
            if (condition.test(num)) {
                count++;
            }
        }
        return count;
    }
}
