package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task52 {
/*
Write a Java program that asks the user to enter a positive integer and determines
whether it is a prime number. If the number is prime, output a message “Is a prime
number”. Otherwise, output a message “Is not prime number”.
 */

    public boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public int getNumber(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive integer: ");
        number=scanner.nextInt();
        if(number<=0){
            System.out.println(number + " value is not positive!");
            return getNumber();
        }
        return number;
    }


    public void execute(){
        System.out.println("Check if a number is prime");
        int number = getNumber();
        System.out.println(isPrime(number) ? "Is a prime number" : "“Is not prime number”");

    }



}
