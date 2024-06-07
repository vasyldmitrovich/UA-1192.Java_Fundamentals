package com.softserve.edu11_str.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {// All is good

//        task1();
//        task2();
        task3();

    }

    public static void task1() {

        System.out.println("PT 11 task 1");

        String var1 = "Roi";
        String var2 = "Roi Oleksii";

        boolean result = var1.equals(var2.substring(0, 3));

        System.out.println(var1);
        System.out.println(var2.substring(0, 3));
        System.out.println(result);

    }


    public static void task2() {

        System.out.println("PT 11 task 2");

        System.out.print("Input last name: ");
        String last = SCANNER.nextLine();

        System.out.print("Input first name: ");
        String first = SCANNER.nextLine();

        System.out.print("Input middle name: ");
        String middle = SCANNER.nextLine();

        System.out.println(last + " " + first.charAt(0) + "." + middle.charAt(0) + ".");
        System.out.println(first);
        System.out.println(first + " " + middle + " " + last);

    }


    public static void task3() {

        System.out.println("PT 11 task 3");

        List<String> name = new ArrayList<>();
        name.add("Tamara");
        name.add("Lo");
        name.add("Alex");
        name.add("Aspeed!");
        name.add("Dimitr");

        for (String names : name) {
            if (checkWithRegExp(names)) {
                System.out.println("Name " + names + " is valid!");
            } else {
                System.out.println("Name " + names + " is not valid!");
            }
        }
    }


    public static boolean checkWithRegExp(String userNameString) {// Nice, this method is nice
        Pattern p = Pattern.compile("^[A-Za-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);

        return m.matches();
    }

}
