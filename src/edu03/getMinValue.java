package edu03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class getMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input random first number : ");
        int first = sc.nextInt();

        System.out.println("input random second number : ");
        int second = sc.nextInt();

        System.out.println("input random third number : ");
        int third = sc.nextInt();

            int min = findMin(first, second, third);
            System.out.println("min value is " + min);

            sc.close();
        }
        public static int findMin(int first, int second, int third) {
        int smallest = Math.min(first, Math.min(second, third));
        return Math.min(first, Math.min(second, third));
        }
    }

