package com.softserve.edu04.hw;
import java.util.Scanner;

public class Faculty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numOfStudents = sc.nextInt();
        System.out.println("Enter season: ");
        String period = sc.next();
        period = period.toUpperCase();
        period = switch (period) {
            case "AUTUMN":
                yield Season.AUTUMN.getPeriod();
            case "WINTER":
                yield Season.WINTER.getPeriod();
            case "SPRING":
                yield Season.SPRING.getPeriod();
            case "SUMMER":
                yield Season.SUMMER.getPeriod();
            default:
                System.out.println("Invalid season entered.");
                yield null;

        };
        System.out.println("Current period is: " + period);
        System.out.println("Students on the faculty now: " + numOfStudents);

    }
}

enum Season {
    AUTUMN("First semester"),
    WINTER("Winter exams"),
    SPRING("Second semester"),
    SUMMER("Summer vacation");

    private String period;
    Season(String period) {
        this.period = period;
    }

    public String getPeriod() {
        return period;
    }
};



