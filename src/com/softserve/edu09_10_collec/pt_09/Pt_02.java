package com.softserve.edu09_10_collec.pt_09;

import java.util.*;

public class Pt_02 {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a number: ");
            String inputNumber = String.valueOf(scan.nextInt());
            list.add(inputNumber);
        }
        System.out.println("The list of entered numbers: " + list);

        Set<String> sameNumbers = new HashSet<>(list);

        List<String> differentNumbers = new ArrayList<>(sameNumbers);

        System.out.println("List without duplicate elements: " + differentNumbers);
    }
}
