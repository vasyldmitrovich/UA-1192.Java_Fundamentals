package com.softserve.edu04.hw;
//hw
import java.util.Scanner;


public class hw2 {// Name of class should start from uppercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input 3 integer numbers ");
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < 3; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }else if (numbers[i]<min){
                min = numbers[i];
            }
        }

        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }

}
