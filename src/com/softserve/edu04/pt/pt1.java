package com.softserve.edu04.pt;
import java.util.Scanner;
//pt

public class pt1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int count = 0;
        if (num1 %2 !=0 ) count ++;
        if (num2 %2 !=0 ) count ++;
        if (num3 %2 !=0 ) count ++;
        System.out.println("There are " + count + " 1 odd numbers");









    }

}
