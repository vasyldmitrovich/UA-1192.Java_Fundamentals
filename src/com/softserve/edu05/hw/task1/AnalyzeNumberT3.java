package com.softserve.edu05.hw.task1;

import com.softserve.utils.ScannerUtils;

public class AnalyzeNumberT3 {
//    Завдання 3: Аналіз 5 цілих чисел
//
//Користувач вводить 5 цілих чисел.
//Програма знаходить позицію другого позитивного числа.
//Програма знаходить мінімальне значення та його позицію в масиві.
//Програма обчислює добуток усіх парних чисел (крім 0, якщо воно введене користувачем).

    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = ScannerUtils.getValue("Enter number: ", Integer.class);
        }
        getPositive(array);
        getMinimal(array);
        System.out.println("Product of all prime numbers " + getProduct(array));
    }

    private static void getPositive(int[] array) {
        int countPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && countPositive < 2) {
                countPositive++;
                if (countPositive == 2) {
                    System.out.println("Positive value is " + array[i] + " on position " + i);
                }
            }
        }
    }

    private static void getMinimal(int[] array) {
        int min = 0;
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                position = i;
            }
        }
        System.out.println("Min number min: " + min +" position: " + position);
    }

    private static Integer getProduct(int[] array){
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i]) && array[i]!=0){
               product=product*array[i];
            }
        }
      return product;
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




}


