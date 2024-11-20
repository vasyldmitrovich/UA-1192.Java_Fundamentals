package com.softserve.edu05.hw.hw1;

import static com.softserve.edu05.hw.hw1.App.SCANNER;

public class Month {

    private int numMonth;
    private int dayInMonth;

    public Month() {
    }

    public Month(int numMonth, int dayInMonth) {
        this.numMonth = numMonth;
        this.dayInMonth = dayInMonth;
    }

    public int getDayInMonth() {
        return dayInMonth;
    }

    public void setDayInMonth(int dayInMonth) {
        this.dayInMonth = dayInMonth;
    }

    public int getNumMonth() {
        return numMonth;
    }

    public void setNumMonth(int numMonth) {
        this.numMonth = numMonth;
    }

    public static void getMonth() {
        Month[] arr = new Month[]{
                new Month(1, 31),
                new Month(2, 28),
                new Month(3, 31),
                new Month(4, 30),
                new Month(5, 31),
                new Month(6, 30),
                new Month(7, 31),
                new Month(8, 31),
                new Month(9, 30),
                new Month(10, 31),
                new Month(11, 30),
                new Month(12, 31),
    };

        System.out.println("Input a month number: ");
        int srNumMonth = SCANNER.nextInt();

        System.out.println("the number of days in that month: ");
        for (int i = 0; i < arr.length; i++) {
            if (srNumMonth == arr[i].getNumMonth()) {
                System.out.println(arr[i].getDayInMonth());
            }
        }
    }
}
