package com.softserve.edu09.pt;

import java.util.LinkedList;
import java.util.Scanner;

public class Utils {
    private static LinkedList<HeavyBox> heavyBox;
    private static final Scanner SCANNER = new Scanner(System.in);

    public Utils() {
    }

    public static LinkedList<HeavyBox> getHeavyBox() {
        return heavyBox;
    }


    public static void create() {

        heavyBox = new LinkedList<>();
        heavyBox.add(new HeavyBox(45, "Socks"));
        heavyBox.add(new HeavyBox(15, "Shoes"));
        heavyBox.add(new HeavyBox(4, "Hats"));

    }

    public static void printArray() {

        for (HeavyBox box : heavyBox) {
            System.out.println("HeavyBox " + heavyBox.indexOf(box) + " " + box);
        }
    }

    public static String getNumber(String prompt) {
        System.out.println(prompt);
        return SCANNER.nextLine();

    }

    public static int getNumber(String prompt, boolean isInt) {
        System.out.println(prompt);
        return SCANNER.nextInt();
    }
}
