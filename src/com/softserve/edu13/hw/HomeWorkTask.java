package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HomeWorkTask {

    private static final Scanner SCANNER = new Scanner(System.in);

    public void task1() {

//1.        Create two methods String encrypt(String s, int n) and String decrypt(String s, int n)
//    Method encrypt should take a string and return coded string where every letter is moved
//    on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
//            return decoded value
        String original = getString("Enter string: ");
        int n = getInt("Enter number of shift: ");

        String encrypted = encrypt(original, n);
        String decrypted = decrypt(encrypted, n);
        System.out.printf("Encrypted string is: " + encrypted +
                "\nDecrypted string is: " + decrypted);
    }

    public void task2() {

//    2. Create method to validate date according to format "mm.dd.yy"
        while (!getString("Do you want enter date?: yes/no").equals("no")) {
            boolean validation = validateDate(getString("Enter date: "));
            System.out.printf("Date is valid?" +
                    "\n" + validation + "\n");
        }
    }

    public void task3() {

// 3. Create method which take year as a parameter and return true if year is a leap
        while (!getString("Do you want enter year?: yes/no").equals("no")) {
            int year = getInt("Enter year");
            boolean leap = isLeapYear(year);
            System.out.println("The year " + year + " is leap?" +
                    "\n" + leap);
        }
    }

    public void task4() {

//4. Create variable LocalDate birthday and set to that variable date your birthday.
//    Create method that take as a parameter object LocalDate and print the day of the week
//    and what was the day of the week after 6 months and what was the day of the week after
//12 months.
        LocalDate birthday = LocalDate.of(1993, Month.AUGUST, 20);
        printDay(birthday);
    }

    private String encrypt(String str, int n) {

        StringBuilder result = new StringBuilder();
        char[] arrayOfChar = str.toCharArray();

        for (int i = 0; i < arrayOfChar.length; i++) {
            if (Character.isLetter(arrayOfChar[i])) {
                char base = Character.isUpperCase(arrayOfChar[i]) ? 'A' : 'a';
                char shifted = (char) ((arrayOfChar[i] - base + n) % 26 + base);
                result.append(shifted);
            } else {
                result.append(arrayOfChar[i]);
            }
        }
        return result.toString();
    }

    private String decrypt(String str, int n) {
        return encrypt(str, 26 - n);
    }

    private String getString(String prompt) {
        System.out.println(prompt);
        return SCANNER.nextLine();
    }

    private int getInt(String prompt) {

        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error entered value not number");
            }
        }
    }

    private static boolean validateDate(String dateStr) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM.dd.yy");

        try {
            LocalDate.parse(dateStr, dateFormat);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private boolean isLeapYear(int year) {
        return LocalDate.of(year, 1, 1).isLeapYear();
    }

    private void printDay(LocalDate date) {

        LocalDate afterSix = date.plusMonths(6);
        LocalDate afterTwelve = date.plusMonths(12);

        System.out.println("The day of week of the day " + date + " is: " + date.getDayOfWeek());
        System.out.println("The day of week of the day after six month " + afterSix + " is: " + afterSix.getDayOfWeek());
        System.out.println("The day of week of the day  after twelve month" + afterTwelve + " is: " + afterTwelve.getDayOfWeek());


    }

}
