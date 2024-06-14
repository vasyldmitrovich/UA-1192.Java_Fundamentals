package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Task134 {

    public static void execute(){
        LocalDate birthday = LocalDate.of(2024, 4, 1);
        getDay(birthday);
    }

    public static void getDay(LocalDate date){
        StringBuilder output = new StringBuilder(String.format("Your date is: %s, and it is %s%n", date, date.getDayOfWeek()));

        LocalDate plus6 = date.plusMonths(6);
        output.append("After 6 months it will be: ").append(plus6.getDayOfWeek()).append("\n");

        LocalDate plus12 = date.plusMonths(12);
        output.append("After 12 months it will be: ").append(plus12.getDayOfWeek()).append("\n");

        System.out.println(output);
    }
}
