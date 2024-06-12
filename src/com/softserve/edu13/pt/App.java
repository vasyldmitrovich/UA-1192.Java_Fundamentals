package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.function.Predicate;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        practicalTask1();
        System.out.println("End of the first practical task");

        practicalTask2();
        System.out.println("End of the second practical task");

        practicalTask3();
        System.out.println("End of the third practical task");

        practicalTask4();
        System.out.println("End of the fourth practical task");
    }

    public static void practicalTask1() {
        System.out.println("Today is " + DayOfWeek.from(LocalDate.now()));
    }

    public static void practicalTask2() {
        TemporalAdjuster firstMonday = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        LocalDate firstMondayDate = LocalDate.now().with(firstMonday);
        System.out.println("Date of first Monday for " + LocalDate.now().getMonth() + " is " + firstMondayDate);
    }

    public static void practicalTask3() {
        boolean stop = false;
        List<String> stringList = new ArrayList<>();

        while (!stop) {
            System.out.println("Enter the string. Enter stop if you want to end");
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                stop = true;
            } else {
                stringList.add(line);
            }
        }

        System.out.println("The initial list is: " + "\n" + stringList.toString());
        Collections.sort(stringList);
        System.out.println("The sorted list is: " + "\n" + stringList.toString());
    }

    public static void practicalTask4() {
        int count = 0;
        int [] intArray = new int[10];

        while (count != 10) {

            try {
                System.out.println("Enter the number");
                intArray[count] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You enter non-integer number");
                System.exit(0);
            }

            count++;
        }

        sc.nextLine();

        System.out.println("Select the condition(enter only number) that will be checked for values in the array " +
                "that satisfy it" + "\n"
                + "1 - Count odd numbers" + "\n"
                + "2 - Count even numbers" + "\n"
                + "3 - Count negative numbers" + "\n"
                + "4 - Count numbers which are greater than 10");

        switch (sc.nextLine()) {
            case "1":
                System.out.println("The number of odd values in array is "
                        + count(intArray, e -> Math.abs(e % 2) == 1));
                break;
            case "2":
                System.out.println("The number of eve values in array is "
                        + count(intArray, e -> Math.abs(e % 2) == 0));
                break;
            case "3":
                System.out.println("The number of negative values in array is "
                        + count(intArray, e -> e < 0));
                break;
            case "4":
                System.out.println("The number of values which are greater than 10 in array is "
                        + count(intArray, e -> e > 10));
                break;
            default:
                System.out.println("You enter wrong number");
        }
    }

    public static int count (int [] intArray, Predicate<Integer> condition) {
        int count = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (condition.test(intArray[i])) {
                count++;
            }
        }

        return count;
    }
}
