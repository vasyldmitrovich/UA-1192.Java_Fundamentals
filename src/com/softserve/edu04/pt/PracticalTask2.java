package com.softserve.edu04.pt;

import java.util.Scanner;

public class PracticalTask2 {

    private int day;

    PracticalTask2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week in number");
        try {
            this.day = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void start() {
        switch (this.day) {
            case 1:
                System.out.println("Понеділок; Monday" );
                break;
            case 2:
                System.out.println("Вівторок; Tuesday");
                break;
            case 3:
                System.out.println("Середа; Wednesday");
                break;
            case 4:
                System.out.println("Четвер; Thursday");
                break;
            case 5:
                System.out.println("П'ятниця; Friday");
                break;
            case 6:
                System.out.println("Субота; Saturday");
                break;
            case 7:
                System.out.println("Неділя; Sunday");
                break;
            default:
                System.out.println("You enter wrong number");
        }
    }
}
