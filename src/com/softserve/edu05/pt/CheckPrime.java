package com.softserve.edu05.pt;

public class CheckPrime {
    public static boolean isPrime(int number) {
        if (number < 0) {
            number = -number;
        }
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
