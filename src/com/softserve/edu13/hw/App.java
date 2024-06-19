package com.softserve.edu13.hw;

import java.time.Year;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        Predicate<Integer> isLeap = Year::isLeap;
        HomeWorksMeths hwm = new HomeWorksMeths();
        System.out.println("ENCRYPTED: " + hwm.encrypt("xyz", 3));
        System.out.println("DECRYPTED: " + hwm.decrypt("abc", 3));
        hwm.dateCheck();
        hwm.isLeap();
        System.out.println("\n\n");
        hwm.getDayOfWeek(hwm.birthday);
    }
}
