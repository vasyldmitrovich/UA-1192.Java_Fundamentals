package com.softserve.edu03.hm;

import java.util.Scanner;

public class hw{// Name of class should start from uppercase
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = getNumber("Input side1:");
        int second = getNumber("Input side2:");
        int third = getNumber("Input side3:");

        double halfPer = (first + second + third) / 2.0;// Why you do not use this variable to print result

        double area = calculateTriangleArea(first,second,third);

        System.out.println("Area of the triangle is: " + area);
        SmallestNum();
    }
private static int getNumber(String res) {
    System.out.println(res);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();

}
    private static double calculateTriangleArea(int a, int b, int c) {
        double halfPer = (a + b + c) / 2.0;
        return Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));
    }

private static double calculateTriangleArea(int a, int b, int c, double halfPer) {
    return Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));

        }// Use reformat code
        public static void SmallestNum (){// Name of method should start from lowercase
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number,second number,third number");
        int firstNum= scanner.nextInt();
        int secondNum= scanner.nextInt();
        int thirdNum=scanner.nextInt();

        int smallestNum=findSmallestNum(firstNum,secondNum,thirdNum);
        System.out.println("Smallest num is:"+smallestNum);}

    private static int findSmallestNum(int a,int b,int c){
        return Math.min(a, Math.min(b,c));
    }// Good




}

