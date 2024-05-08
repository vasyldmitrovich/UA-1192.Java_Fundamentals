package com.softserve.edu04.pt;
//pt
import java.util.Scanner;

public class pt2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please, enter number of the day of the week");
        int dayNumber = scanner.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.getByNumber(dayNumber);
        System.out.println("This number is related to " + dayOfWeek.engName);
        System.out.println("Цей номер відноситься до такого дню: " + dayOfWeek.ukrName);


    }

}

enum DayOfWeek {
    MONDAY ("Понеілок", "Monday"),
    TUESDAY ("Вівторок", "Tuesday"),
    WEDNESDAY ("Середа", "Wednesday"),
    THURSDAY ("Четверг", "Thursday"),
    FRIDAY ("П'ятниця", "Friday"),
    SATURDAY ("Субота", "Saturday"),
    SUNDAY ("Неділя", "Sunday");

    public  final  String ukrName;
    public  final String engName;
    DayOfWeek (String ukrName, String engName) {
        this.ukrName = ukrName;
        this.engName = engName;
    }

    public static DayOfWeek getByNumber (int number )
    {
        return switch (number) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;

            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }
}

