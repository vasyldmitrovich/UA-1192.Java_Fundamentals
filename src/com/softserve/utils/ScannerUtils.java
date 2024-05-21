package com.softserve.utils;

import java.util.Scanner;

public class ScannerUtils {
private static final Scanner scanner = new Scanner(System.in);

    public static <T> T getValue(String prompt, Class<T> type) {
        System.out.println(prompt);
        if (type == Double.class) {
            Double value = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера
            return type.cast(value);
        } else if (type == Integer.class) {
            Integer value = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера
            return type.cast(value);
        } else if (type == Float.class) {
            Float value = scanner.nextFloat();
            scanner.nextLine(); // Очистка буфера
            return type.cast(value);
        } else if (type == Long.class) {
            Long value = scanner.nextLong();
            scanner.nextLine(); // Очистка буфера
            return type.cast(value);
        } else if (type == String.class) {
            return type.cast(scanner.next());
        } else if (type == Boolean.class){
            return type.cast(scanner.nextBoolean());
        } else {
            throw new IllegalArgumentException("Unsupported type.");
        }
    }


}
