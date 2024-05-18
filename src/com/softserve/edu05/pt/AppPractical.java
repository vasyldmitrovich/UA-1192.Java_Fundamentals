package com.softserve.edu05.pt;

import com.softserve.edu05.pt.entity.Employee;
import com.softserve.utils.ScannerUtils;

import java.util.*;

public class AppPractical {
    public static void main(String[] args) {
        //task1
        checkArrayElement();
        //task2
        checkPrimeNumber();
        //task3
        task3();
        //task4
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Kate", 1, "38063", 200));
        employeeList.add(new Employee("Luke", 7, "38023", 230));
        employeeList.add(new Employee("Tim", 2, "38065", 200));
        employeeList.add(new Employee("Alex", 1, "38062", 100));
        employeeList.add(new Employee("Kim", 7, "38064", 223));

        int departNumber = ScannerUtils.getValue("Input department number to check in array", Integer.class);

        employeeList.stream()
                .filter(e -> e.getDepartment() == departNumber)
                .sorted(Employee::compareTo)
                .forEach(System.out::println);
    }

    private static void checkArrayElement() {
        //sort String Array
        String[] arrayString = {"sa", "sdf", "pd", "wer", "weq"};
        System.out.println("Array before sort : " + Arrays.toString(arrayString));
        Arrays.sort(arrayString);
        System.out.println("Array before sort : " + Arrays.toString(arrayString));

        //getArrayAverage
        int[] arrayInteger = {1, 34, 334, 123, 962};
        System.out.println("Array : " + Arrays.toString(arrayInteger));
        System.out.println("Array average : " + Arrays.stream(arrayInteger).average());

        //check if array contains a value
        int checkValue = ScannerUtils.getValue("Input number to check in array", Integer.class);

        Integer[] arrayIntegerBoxed = Arrays.stream(arrayInteger).boxed().toArray(Integer[]::new);

        boolean exists = Arrays.asList(arrayIntegerBoxed).contains(checkValue);
        System.out.println("Check exist in array: " + exists);
    }


    private static void checkPrimeNumber() {
        int checkValue = ScannerUtils.getValue("Input positive integer to check", Integer.class);
        System.out.printf("Is number %s is prime - ", checkValue, isPrime(checkValue));
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


    private static void task3() {
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = getRandomNumber();
        }
        System.out.println("Your random array: " + Arrays.toString(arrayInt));
        System.out.println("The biggest number in the array: " + Arrays.stream(arrayInt).max());
        System.out.println("The sum of all positive numbers: " + Arrays.stream(arrayInt).filter(i -> i >= 0).sum());
        long countNegative = Arrays.stream(arrayInt).filter(i -> i < 0).count();
        long countPositive = Arrays.stream(arrayInt).filter(i -> i >= 0).count();
        System.out.println("Count of negative numbers: " + countNegative);

        if (countPositive > countNegative) {
            System.out.println("There are more positive values in the array.");
        } else if (countPositive < countNegative) {
            System.out.println("There are more negative values in the array.");
        } else
            System.out.println("There are an equal number of positive and negative values in the array.");
    }

    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(2001) - 1000;
    }
}
