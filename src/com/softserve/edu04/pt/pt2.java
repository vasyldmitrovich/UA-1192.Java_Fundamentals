package com.softserve.edu04.pt;

import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week");

        int dayNumber = scanner.nextInt();

        scanner.close();

        if (dayNumber >= 1 && dayNumber <= 7) {
            DaysOfTheWeek[] days = DaysOfTheWeek.values();
            DaysOfTheWeek selectedDay = days[dayNumber - 1];
            System.out.println("Day of the week is " + selectedDay);
        } else {
            System.out.println("Input a valid day number");
        }

    }
}
