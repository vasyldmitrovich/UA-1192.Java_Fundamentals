package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PracticalTasksMethods implements Predicate {
    LocalDate dayOfWeek = LocalDate.now();

    public PracticalTasksMethods() {
    }

    String prompt;

    public void setPrompt(String s) {
        this.prompt = s;
    }

    public void DayOfTheWeek() {
        setPrompt("Today is: ");
        System.out.println(prompt + dayOfWeek.getDayOfWeek().toString().substring(0, 1).toUpperCase()
                + dayOfWeek.getDayOfWeek().toString().substring(1).toLowerCase());
    }

    public void getDateOf() {
        LocalDate firstMonday = dayOfWeek.withDayOfMonth(1);
        while (firstMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstMonday = firstMonday.plusDays(1);
        }
        System.out.println("The first Monday of this month was on: " + firstMonday);
    }

    public List<String> sortList(List<String> list) {
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    Predicate<Integer> notEven = i -> i % 2 != 0;

    public List<Integer> count(int[] arr, Predicate<Integer> predicate) {
        List<Integer> newSet = new ArrayList<>();
        List<int[]> arrs = List.of(arr);
        for (int i = 0; i < arr.length; i++) {
            if (notEven.test(arr[i])) {
                newSet.add(arr[i]);
            }
        }
        System.out.printf("There is %d elements which fill the condition:%n", newSet.stream().count());
        return newSet;
    }

    @Override
    public boolean test(Object o) {
        return false;
    }
}

