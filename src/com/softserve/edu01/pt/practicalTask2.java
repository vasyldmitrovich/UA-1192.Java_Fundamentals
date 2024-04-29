package com.softserve.edu01.pt;

import java.util.Scanner;

public class practicalTask2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);  //(a+b+c)/3
        float number = 0, sum = 0, numberOfNumbers = 0, averageNum = 0;

        while(numberOfNumbers<3){
            System.out.println("Imput number");
            number = scan.nextInt();
            sum= sum + number;
            numberOfNumbers++;

        }
        averageNum = sum/numberOfNumbers;
        System.out.println("Average is " + averageNum);
    }
}
