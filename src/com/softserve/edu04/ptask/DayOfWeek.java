package com.softserve.edu04.ptask;

public enum DayOfWeek {
    Monday("Monday", "Понеділок"),
    Tuesday("Tuesday", "Вівторок"),
    Wednesday("Wednesday", "Середа"),
    Thursday("Thursday", "Четвер"),
    Friday("Friday", "П'ятниця"),
    Saturday("Saturday", "Субота"),
    Sunday(" Sunday", "Неділя");

    public final String engName;
    public final String ukrName;

    DayOfWeek(String engName, String ukrName) {
        this.engName = engName;
        this.ukrName = ukrName;
    }

    public static DayOfWeek getNumber(int number) {
        return switch (number) {
            case 1 -> Monday;
            case 2 -> Tuesday;
            case 3 -> Wednesday;
            case 4 -> Thursday;
            case 5 -> Friday;
            case 6 -> Saturday;
            case 7 -> Sunday;
            default -> throw new IllegalArgumentException("There is no such day number in a week: " + number);
        };
    }
}

