package com.softserve.edu04.pt.task2;
import java.util.Scanner;

public class Task2 {// Good
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the day of the week");

        int day = scanner.nextInt();

        String result = switch (day) {
            case 1 -> "Monday - Понеділок";
            case 2 -> "Tuesday - Вівторок";
            case 3 -> "Wednesday - Середа";
            case 4 -> "Thursday - Четвер";
            case 5 -> "Friday - П'ятниця";
            case 6 -> "Saturday - Субота";
            case 7 -> "Sunday - Неділя";
            default -> "Invalid number of the day";
        };
        System.out.println(result);
    }
}
