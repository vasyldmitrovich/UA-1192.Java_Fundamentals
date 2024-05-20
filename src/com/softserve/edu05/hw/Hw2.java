package com.softserve.edu05.hw;

public class Hw2 {
    public static void hw2Task() {
        boolean answer;
        do {
            doArray();
            answer = askUser();
        } while (answer);
    }

    public static int arraySum(int[] arr) {
        return arr[0] + arr[1];
    }

    public static boolean askUser() {
        boolean answer = false;
        System.out.println("\nDo you want to repeat?");
        switch (Hw1_1.SCANNER.next().toLowerCase()) {
            case "yes" -> answer = true;
            case "no" -> answer = false;
        }
        return answer;
    }

    public static void doArray() {
        System.out.println("\nEnter 2 numbers:");
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Hw1_1.getNumber();
        }
        int res = arraySum(arr);
        System.out.printf("Sum of numbers is: %d", res);
    }
}


