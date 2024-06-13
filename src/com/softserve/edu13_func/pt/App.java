package com.softserve.edu13_func.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.softserve.edu13_func.pt.App.StringSorter.sortStrings;

public class App {

    public static void main(String[] args) {// Ok

//        task1();
//        task2();
        task3();

    }

    public static void task1() {

        LocalDate today = LocalDate.now();

        DayOfWeek dayOfWeek = today.getDayOfWeek();

        System.out.println("Today: " + dayOfWeek);

        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());

        LocalDate firstMonday = firstDayOfMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));

        System.out.println("date of first Monday for current month: " + firstMonday);
    }

    public static void task2() {

        List<String> strings = List.of("111", "555", "333", "4444");
        List<String> sortedStrings = sortStrings(strings);
        System.out.println("Sorted strings: " + sortedStrings);
    }


    public static void task3() {

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int countGreaterThanFive = count(numbers, n -> n > 3);
        System.out.println("Quantity numbers greater than 3: " + countGreaterThanFive);

                int countEvenNumbers = count(numbers, n -> n % 2 == 0);
        System.out.println("Quantity even numbers: " + countEvenNumbers);
    }



    public class StringSorter {
        public static List<String> sortStrings(List<String> strings) {
            return strings.stream()
                    .sorted()
                    .collect(Collectors.toList());
        }
    }

    public static int count(Integer[] array, Predicate<Integer> condition) {
        int count = 0;
        for (Integer number : array) {
            if (condition.test(number)) {
                count++;
            }
        }
        return count;
    }
}

