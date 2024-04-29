package com.softserve.edu01.hw;

import java.util.Scanner;


public class HomeWork2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address = scanner.nextLine();
        System.out.println(name + ", you live in " + address);

    }
}
