package com.softserve.edu01.pt;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        // Practical tasks

        // Task 1
        {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Input text");
            String word1 = myObj.nextLine();
            String word2 = myObj.nextLine();
            String word3 = myObj.nextLine();
            System.out.println("Output text in reserve order: ");
            System.out.println(word3);
            System.out.println(word2);
            System.out.println(word1);
        }

        // Task 2
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input first number: ");
            int num1 = in.nextInt();
            System.out.print("Input second number: ");
            int num2 = in.nextInt();
            System.out.print("Input third number: ");
            int num3 = in.nextInt();
            System.out.println("Average is: " + (num1 + num2 + num3) / 3);
        }

        // Task 3
        {
            Scanner var1 = new Scanner(System.in);
            System.out.print("a = ");
            int var2 = var1.nextInt();
            System.out.print("b = ");
            int var3 = var1.nextInt();
            int var4 = var2 + var3;
            int var5 = var2 - var3;
            int var6 = var2 * var3;
            int var7 = var2 / var3;
            System.out.println("a+b = " + var4);
            System.out.println("a-b = " + var5);
            System.out.println("a*b = " + var6);
            System.out.println("a/b = " + var7);
        }

        // Task 4
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("How are you?");
            String answer = br.readLine();
            System.out.println("You are " + answer);
        }

    }
}
