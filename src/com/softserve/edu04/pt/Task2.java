package com.softserve.edu04.pt;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the day of the week(1-7): ");
        int day = sc.nextInt();
        Days days = Days.getByNumber(day);
        System.out.println("English name of the day: " + days.getLang1());
        System.out.println("Ukrainian name of the day: " + days.getLang2());

        }
    }

enum Days {
    First("Monday", "Понеділок"),
    Second("Tuesday", "Вівторок"),
    Third("Wednesday", "Середа"),
    Fourth("Thursday", "Четвер"),
    Fifth("Friday", "П'ятниця"),
    Sixth("Saturday", "Субота"),
    Seventh("Sunday", "Неділя");

    private String lang1;
    private String lang2;

    Days(String lang1, String lang2){
        this.lang1 = lang1;
        this.lang2 = lang2;
    }

    public String getLang1() {
        return lang1;
    }

    public String getLang2() {
        return lang2;
    }
    public static Days getByNumber(int number) {
        return switch (number) {
            case 1 -> Days.First;
            case 2 -> Days.Second;
            case 3 -> Days.Third;
            case 4 -> Days.Fourth;
            case 5 -> Days.Fifth;
            case 6 -> Days.Sixth;
            case 7 -> Days.Seventh;
            default -> throw new IllegalArgumentException("There is no such a day number in week " + number);
        };
    }
}