package com.softserve.edu04.hw;
//hw
import java.util.Scanner;


public class hw1 {// Name of class should start from uppercase
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter three float numbers:");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        if (a >= -5 && b >= -5 && c >= -5 && a <= 5 && b <=5 && c <= 5) {
            System.out.println("This numbers are within the range [-5, 5].");}
        else {System.out.println("Not all numbers belong to the range [-5, 5]");}

    }
}
