package com.softserve.edu03.hw;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = sc.nextInt();
        System.out.print("Input the Second number: ");
        int y = sc.nextInt();
        System.out.print("Input the third number: ");
        int z = sc.nextInt();
        System.out.print("The smallest number is " + smallest(x, y, z)+"\n" );
    }

    public static int smallest(int x, int y, int z)
    {
        return Math.min(Math.min(x, y), z);
    }
}
