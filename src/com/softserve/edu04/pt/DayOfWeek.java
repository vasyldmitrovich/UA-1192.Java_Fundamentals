package com.softserve.edu04.pt;

public enum DayOfWeek {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    private final String engName;
    private final String ukrName;

    DayOfWeek(String engName, String ukrName) {
        this.engName = engName;
        this.ukrName = ukrName;
    }

    public String getEnglish() {
        return this.engName;
    }

    public String getUkrName() {
        return this.ukrName;
    }

    public static DayOfWeek of(int posOfWeek) {
        return DayOfWeek.values()[posOfWeek - 1];
    }
}
