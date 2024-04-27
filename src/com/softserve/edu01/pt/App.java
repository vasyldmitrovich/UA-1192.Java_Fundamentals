package com.softserve.edu01.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

            BufferedReader task = new BufferedReader(new InputStreamReader(System.in));
//TASK1
            System.out.println("Let's reverse your text :) Write something!");
            String first = task.readLine();
            String second = task.readLine();
            String third = task.readLine();


            System.out.println("\nLook!\n");
            System.out.println(third);
            System.out.println(second);
            System.out.println(first + "\n");


//TASK2
            System.out.println("Let's find the average number out of the 3 proposed ones");
            double number1 = Double.parseDouble(task.readLine());
            double number2 = Double.parseDouble(task.readLine());
            double number3 = Double.parseDouble(task.readLine());
            double average = number1+number2+number3;
            System.out.println("Average value is: " + average/3 + "\n");

//TASK3
            System.out.println("Let's calculate 2 values. Write 2 values in console:");
            Float value1 = Float.parseFloat(task.readLine());
            Float value2 = Float.parseFloat(task.readLine());

            Float res1 = value1+value2;
            Float res2 = value1-value2;
            Float res3 = value1*value2;
            Float res4 = value1/value2;

            System.out.println("Look!\n"+ res1);
            System.out.println(res2);
            System.out.println(res3);
            System.out.println(res4);

//TASK4
            System.out.println("How are you?");
            String answer = task.readLine();
            System.out.println("You are " + answer);
        }

    }

