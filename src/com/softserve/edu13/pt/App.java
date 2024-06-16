package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class App {
    public static void main(String[]args){

        task1();
        task2();
        task3();
        task4();
    }
        public static void task1() {
            DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
            System.out.println("Today is " + dayOfWeek);
        }

        public static void task2() {
            LocalDate currentDate = LocalDate.now();
            LocalDate firstInMonth = currentDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

            System.out.println("A date of first Monday for current month: " + firstInMonth);
        }

        public static void task3() {
            List<String> list = Arrays.asList("Svitlana", "Inna", "Olga", "Anna", "Dima", "Ivan");

            List<String> sortedList = list.stream().sorted().toList();

            System.out.println("Sorted list " + sortedList);
        }

        public static void task4() {
            int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("Integer array: " + Arrays.toString(integers));
            long count = count(integers, num -> num % 2 == 0);
            System.out.println(new StringBuilder().append("The number of even numbers in the list: ").append(count).toString());
        }

        private static long count(int[] ints, IntPredicate predicate) {
            return Arrays.stream(ints).filter(predicate).count();
        }
    }







